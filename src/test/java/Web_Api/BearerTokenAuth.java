package Web_Api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.basic;

public class BearerTokenAuth {

    @Test
            public void testUsingBearerToken(){
        String BASE_URI = "https://httpbin.org/basic-auth/user/password";

        ///BearerToken using Header and access the bearerToken

        String bearerToken = "50c36fd8aa69faa312af9869d41960d92761fbe28b90ea07cec879ac790030bc";

        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri(BASE_URI)
                .addHeader("Authorization", "Bearer " +bearerToken).build();


    }

}
