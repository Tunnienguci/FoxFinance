package bank.authentication.models;

import lombok.Data;

@Data
public class AuthDTO {
    Integer id;
    String username;
    Integer passcode;
    Integer accountNum;
}
