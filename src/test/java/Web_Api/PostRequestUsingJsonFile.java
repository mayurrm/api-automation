package Web_Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

public class PostRequestUsingJsonFile {

    @Test
    public void testPostRequestUsingJsonFile() {
        String BASE_URI = "https://reqres.in/api/users";

        File file = new File("src/main/resources/test.json");

        Response response =  RestAssured.given().body(file).header("Content-Type", "application/json").baseUri(BASE_URI).log().all().when().post()
                .then().log().all().extract().response();

        System.out.println("status code: "+response.statusCode());
    }
}

