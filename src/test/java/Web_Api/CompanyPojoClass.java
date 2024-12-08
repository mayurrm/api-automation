package Web_Api;

import Model.Company;
import Model.CompanyPFDetails;
import Model.Contractor;
import Model.Employee;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyPojoClass {
    @Test
    public void testUsingCompanyPojoClass(){
        String BASE_URI = "https://petstore.swagger.io/#/pet/addPet";

        Company company = Company.builder().companyName("QA Automation").companyEmailId("qaautomation@org.com").companyNumber("+353891234121").companyAddress("12, HeneryStreet, Dublin, D12PW20").build();
        List<String>strings = Arrays.asList("AIB","BOI","PSB");

        Employee employee1 = Employee.builder().firstName("Mayur").lastName("Mamankar").age(28).salary(25000).designation("QA Auto Engineer").build();
        Employee employee2 = Employee.builder().firstName("Akshay").lastName("Dabhade").age(28).salary(40000).designation("Devops Engineer").build();
        Employee employee3 = Employee.builder().firstName("Shantanu").lastName("Thakare").age(28).salary(60000).designation("Marketing Manager").build();
        List<Employee>employees = Arrays.asList(employee1,employee2,employee3);

        Contractor contractor1 = Contractor.builder().firstName("John").lastName("Mathew").contractFrom("Jan-2018").contractTo("Aug-2022").contactNumber("+919688881422").build();
        Contractor contractor2 = Contractor.builder().firstName("Seema").lastName("Prasad").contractFrom("Jun-2019").contractTo("Jun-2023").contactNumber("+919631384422").build();
        List<Contractor>contractors =Arrays.asList(contractor1,contractor2);
        CompanyPFDetails companyPFDetails = CompanyPFDetails.builder().pfName("XYZ").pfYear(2020).noOfEmployees(100).build();

        Company company1 = Company.builder().supportedSalaryBanks(strings).employee(employees).contractors(contractors).companyPFDeails(companyPFDetails).build();

        Map<String, String> map = new HashMap<>();
        map.put("Content-Type","application/json");
        map.put("Authorization","Bearer 50c36fd8aa69faa312af9869d41960d92761fbe28b90ea07cec879ac790030bc");

        Response response =  RestAssured.given().body(company1).header("Content-Type", "application/json").baseUri(BASE_URI).log().all().when().post()
                .then().log().all().extract().response();

    }
}
