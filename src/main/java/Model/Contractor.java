package Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Contractor {

    private String firstName;
    private String lastName;
    private String contractFrom;
    private String contractTo;
    private String contactNumber;
}
