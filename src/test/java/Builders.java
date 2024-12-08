import Model.Employe;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class Builders {

    @Test
    public void testPostRequestUsingBuilder(){

        String BASE_URI = "https://reqres.in/api/users";

        Employe employee = Employe.builder().age(28).name("Mayur").job("QA").build();

        Response response = RestAssured.given().header("Content-Type", "application/json").body(employee).baseUri(BASE_URI).log().all().when().post()
                .then().log().all().extract().response();
        System.out.println(response.statusCode());



    }
}
