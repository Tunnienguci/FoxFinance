package foxfinance.user.models;

import lombok.Data;
@Data
public class UserRequest {
    private UserDTO dto;
    Long status;
    String messages;
}
