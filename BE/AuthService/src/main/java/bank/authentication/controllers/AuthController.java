package bank.authentication.controllers;

import bank.authentication.models.AuthDTO;
import bank.authentication.models.AuthResponse;
import bank.authentication.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    private final AuthService authService;
    @PostMapping("/login")
    String login(@RequestBody AuthDTO data){
        return authService.login(data.getUsername(), data.getPasscode());
    }
}
