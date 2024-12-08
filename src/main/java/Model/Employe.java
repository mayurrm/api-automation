package Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Employe {

    String name;
    int age;
    String job;


}
