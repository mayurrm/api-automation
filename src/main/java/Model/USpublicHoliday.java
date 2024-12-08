package Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class USpublicHoliday {

    private String date;
    private String localName;
    private String name;
    private String countryCode;
    private boolean fixed;
    private boolean global;
    private String[] counties;
    private int launchYear;
    private String type;

}
