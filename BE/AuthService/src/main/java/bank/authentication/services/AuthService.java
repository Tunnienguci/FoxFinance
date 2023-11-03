package bank.authentication.services;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import bank.authentication.entities.Auth;
import bank.authentication.repositories.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class AuthService {

    // Declare dependencies
    private final AuthRepository authRepository;

    public String login(String username, Integer passcode) {
        Auth auth = authRepository.findByUsername(username);
        if (auth != null) {
            Integer payload = auth.getAccountNum();
            if (Objects.equals(passcode, auth.getPasscode())) {
                String apiUrl = "http://localhost:8080/user/account?accountNum=" + payload;
                WebClient webClient = WebClient.create();
                ResponseEntity<String> response = webClient
                        .method(HttpMethod.GET)
                        .uri(apiUrl)
                        .retrieve()
                        .toEntity(String.class)
                        .block();
                if (response != null && response.getStatusCode().is2xxSuccessful()) {
                    String responseBody = response.getBody();
                    return responseBody;
                } else {
                    return "Error occurred during API call!";
                }
            } else {
                return "Password incorrect!";
            }
        } else {
            return "Username does not exist!";
        }
    }
}
