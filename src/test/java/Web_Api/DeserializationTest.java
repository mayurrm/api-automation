package Web_Api;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import resource.Users;

import static io.restassured.RestAssured.given;

public class DeserializationTest {
    @Test
    public void Deserialization() {

        String BASE_URI = "https://reqres.in/api/users/Users?page=2";

        Response response = given()
                .baseUri(BASE_URI)
                .queryParam("page", 2)      // Query param for page number
                .when()
                .log().all()
                .get("https://reqres.in/api/users/Users/users?page=2")              // Correct endpoint path
                .then()
                .extract()
                .response();


        Users users = response.as(Users.class);    // testUsingDeserialization
        System.out.println(users.getSupport().getUrl());
        System.out.println(users.getData().get(0).getFirst_name());

        //List<String> emailList = new ArrayList<>();

        //for( Data data  :users.getData()) {
        //  emailList.add(data.getEmail());
        //System.out.println(emailList);

    }
}