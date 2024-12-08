package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.html.HTML;
import java.security.PrivateKey;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private int id;
    private Object category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;


}
