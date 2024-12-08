package Web_Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PostRequestUsingMap {
    @Test

    public void testPostRequestUsingMap() {
        String BASE_URI = "https://reqres.in/api/users";

        Map<String, String> map = new HashMap<>();
        map.put("name", "morpheus");
        map.put("job", "leader");

        Response response = RestAssured.given().header("Content-Type", "application/json").body(map).baseUri(BASE_URI).log().all().when().post()
                .then().log().all().extract().response();

        System.out.println("status code: " + response.statusCode());


    }
}