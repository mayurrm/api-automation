package resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
public class Data {

     private String id;
     private String email;
     private String first_name;
     private String last_name;
     private String avatar;


}
