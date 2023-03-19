package com.vpetrou.dev.patterns.creational.builder;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserBuilderTest {

    User user;

    WireMockServer wireMockServer;

    @BeforeAll
    public void beforeAll() {
        user = new UserBuilder().setId("1")
                .setName("Name")
                .setAddress("Address")
                .setEnabled(true).build();

        wireMockServer = new WireMockServer(options().port(8881));
        wireMockServer.start();

        //Mock GET Request and Response
        wireMockServer.stubFor(get(urlEqualTo("/test"))
                .willReturn(aResponse()
                        .withBody("Welcome to test!")
                        .withStatus(200)));

        //Mock POST Request and Response
        wireMockServer.stubFor(post(urlEqualTo("/test"))
                .withRequestBody(equalToJson(new Gson().toJson(user)))
                .willReturn(aResponse().withBody("User created: " + user.getName())
                        .withStatus(201)));
    }

    @Test
    public void testWiremockGet() {
        Response response = given().baseUri("http://localhost:8881")
                .contentType(ContentType.JSON)
                .log().all()
                .get("/test");
        Assertions.assertEquals("Welcome to test!", response.getBody().asString());
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testUserBuilderPost() {
        Response response = given().baseUri("http://localhost:8881")
                .contentType(ContentType.JSON)
                .log().all()
                .body(user)
                .log().all()
                .post("/test").andReturn();

        Assertions.assertEquals("User created: " + user.getName(), response.getBody().asString());
        Assertions.assertEquals(201, response.getStatusCode());
    }

    @AfterAll
    public void afterAll() {
        wireMockServer.stop();
    }
}
