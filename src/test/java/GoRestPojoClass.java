import Model.GoRest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GoRestPojoClass {

    @Test
    public void testUsingGoRestPojoClass(){

        String BASE_URI = "https://reqres.in/api/users/2";

        /// Request Body using Pojo class

        GoRest goRest = GoRest.builder().name("Mayur").gender("male").email("mayurrm@gmail.com").status("QA").build();

        Map<String, String> map = new HashMap<>();
        map.put("Content-Type","application/json");
        map.put("Authorization","Bearer 50c36fd8aa69faa312af9869d41960d92761fbe28b90ea07cec879ac790030bc");

        Response response =  RestAssured.given().body(goRest).header("Content-Type", "application/json").baseUri(BASE_URI).log().all().when().post()
                .then().log().all().extract().response();
    }

}
