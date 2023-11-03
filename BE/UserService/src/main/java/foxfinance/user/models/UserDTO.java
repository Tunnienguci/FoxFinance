package foxfinance.user.models;

import lombok.Data;

@Data
public class UserDTO {
    private Integer id;
    String fullName;
    String dob;
    Integer accountNum;
    private Integer cash;
}
