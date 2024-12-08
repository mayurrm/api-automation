package Web_Api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthTest {

    String BASE_URI = "https://httpbin.org/basic-auth/user/password";

    ///BASIC AUTH USING
    RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri(BASE_URI).setAuth(basic("user", "password")).build();


    @Test
    public void testWithoutBasicAuth() {
        Response response = given().spec(requestSpecification).when().get().then().extract().response();
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(), 200, "States code is not matching");

    }
    @Test
    public void testWithBasicAuth() {
        Response response = given().spec(requestSpecification).auth().basic("user", "password").when().get().then().extract().response();
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(), 200, "States code is not matching");

    }
}