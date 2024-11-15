package apiTests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    public void createPet(){
        String body = "{" +
                "\"id\": 777, " +
                "\"category\": " +
                "{ \"id\": 1, " +
                "\"name\": \"kitty\"}," +
                "\"name\": \"Diana\", " +
                "\"photoUrls\": " +
                "[\"https://drive.google.com/file/d/1GnJJY2rtrdIZhMUj-2LIpnwoZRaXKS08/view?usp=sharing\"]," +
                "\"tags\": [ " +
                "{ " +
                "\"id\": 7, " +
                "\"name\": \"Britain\"}" +
                "]," +
                "\"status\": \"available\"" +
                "}";

        given()
                .contentType(ContentType.JSON)
                .body(body)
                .when().post("https://petstore.swagger.io/v2/pet")
                .then().statusCode(200);
    }


    @Test
    public void checkPet(){
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("pet" + "/777")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);

    }

    @Test
    public void deletePet(){
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("pet" + "/777")
                .contentType(ContentType.JSON)
                .when().delete()
                .then().statusCode(200);
    }

    @Test
    public void checkPetWithInvalidAuthData(){
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("pet" + "/777")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(404);
    }
}