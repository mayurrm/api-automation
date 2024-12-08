package Web_Api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void testGetRequest() {

        String BASE_URI = "https://reqres.in/api";

        Response response = given().baseUri(BASE_URI).basePath("/Users").queryParams("page", 2).when().log().all().get()
                .then().extract().response();

        Assert.assertEquals(response.statusCode(), 200, "response is not matching");

        JsonPath jsonPath = response.jsonPath();

        int total = jsonPath.getInt("total");

        System.out.println("total: " + total);

    }
}