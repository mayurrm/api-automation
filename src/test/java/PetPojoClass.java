import Model.Category;
import Model.Pet;
import Model.Tag;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetPojoClass {
    @Test
    public void testUsingPetPojoClass(){
        String BASE_URI = "https://petstore.swagger.io/#/pet/addPet";

        Category category = Category.builder().id(12).name("Mayur").build();
        Tag tags1 = Tag.builder().id(14).name("Akshay").build();
        Tag tags2 = Tag.builder().id(27).name("Kunal").build();
        List<Tag>tags =Arrays.asList(tags1,tags2);
        List<String> strings= List.of("www.Amazon.com","www.gmail.com");

        Pet pet = Pet.builder().id(143).category(category).name("doggie").photoUrls(strings).tags(tags).status("Available").build();
        Map<String, String> map = new HashMap<>();
        map.put("Content-Type","application/json");
        map.put("Authorization","Bearer 50c36fd8aa69faa312af9869d41960d92761fbe28b90ea07cec879ac790030bc");

        Response response =  RestAssured.given().body(pet).header("Content-Type", "application/json").baseUri(BASE_URI).log().all().when().post()
                .then().log().all().extract().response();
    }

}


