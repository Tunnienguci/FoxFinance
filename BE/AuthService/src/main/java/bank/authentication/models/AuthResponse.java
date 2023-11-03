package bank.authentication.models;

import lombok.Data;

import java.util.List;

@Data
public class AuthResponse {
    List<AuthDTO> authDTOS;
    long statusResponse;
}
