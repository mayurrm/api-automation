package Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CompanyPFDetails {

    private String pfName;
    private int pfYear;
    private int noOfEmployees;

}
