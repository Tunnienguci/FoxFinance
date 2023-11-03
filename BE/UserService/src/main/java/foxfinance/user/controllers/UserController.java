package foxfinance.user.controllers;

import foxfinance.user.models.UserResponse;
import foxfinance.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserService userService;

    @GetMapping("/to")
    UserResponse getUser(@RequestParam Integer accountNum) {
        return userService.getUser(accountNum);
    }

    @GetMapping("/account")
    UserResponse getMyUser(@RequestParam Integer accountNum){
        return userService.getMyUser(accountNum);
    }
}
