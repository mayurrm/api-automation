package Web_Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostRequestUsingString {
    @Test
    public void testPostRequestUsingString() {

        String BASE_URI = "https://reqres.in/api/users";

        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        Response response = RestAssured.given().header("Content-Type", "application/json").baseUri(BASE_URI).body(body).log().all().when().post()
                .then().extract().response();

        System.out.println("status code: " + response);

        }
    }

