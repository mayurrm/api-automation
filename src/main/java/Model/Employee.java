package Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String designation;
    private String contactNumber;
    private String emailId;
}
