package foxfinance.user.models;

import lombok.Data;

import java.util.List;
@Data
public class UserResponse {
    List<UserDTO> data;
    long resultCd;
}
