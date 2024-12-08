package Web_Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadOperation {
    @Test
    public void uploadFile(){

        String BASE_URI = "https://file.io";

        File file = new File("src/main/resources/APITest.txt");
        Response response = RestAssured.given().
               baseUri(BASE_URI).
                when().
                multiPart(file).
                post().then().log().all().extract().response();

        Assert.assertEquals(response.getStatusCode(),200 "msmsms");






    }
}
