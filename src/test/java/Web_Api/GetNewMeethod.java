package Web_Api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetNewMeethod {
    @Test
    public void testGetRequest(){

        String BASE_URI = "https://reqres.in/api/users/2";

        Response response = given().baseUri(BASE_URI).when().get().then().extract().response();
        int i= response.statusCode();

        System.out.println(i);
        Assert.assertEquals(response.statusCode(),200, "response is not matching");
       JsonPath jsonPath =response.jsonPath();
       String FirstName= jsonPath.getString("data.first_name");
        System.out.println(FirstName);

        String LastName= jsonPath.getString("data.last_name");
        System.out.println(LastName);

        String email= jsonPath.getString("data.email");
        System.out.println(email);

        Assert.assertTrue(email.contains("reqres"), "email does not have content");




    }
}
