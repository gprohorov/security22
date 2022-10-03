package pro.edu.security22.model;
/*
  @author   george
  @project   security22
  @class  Item
  @version  1.0.0 
  @since 03.10.22 - 15.39
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    private String id;
    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
