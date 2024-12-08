package Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GoRest {
    private String name;
    private String gender;
    private String email;
    private String status;



}
