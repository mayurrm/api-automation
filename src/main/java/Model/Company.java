package Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Company {

    private String companyName;
    private String companyEmailId;
    private String companyNumber;
    private String companyAddress;
    private List<String> supportedSalaryBanks;
    private List<Employee> employee;
    private List<Contractor> contractors;
    private CompanyPFDetails companyPFDeails;
}
