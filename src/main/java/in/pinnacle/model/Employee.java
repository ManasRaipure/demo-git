package in.pinnacle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
       private  Integer  id;
       private  String  name;
       private  String  email;
       private  Long  phone;

}
