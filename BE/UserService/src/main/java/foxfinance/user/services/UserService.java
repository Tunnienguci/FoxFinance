package foxfinance.user.services;

import foxfinance.user.entities.User;
import foxfinance.user.models.UserDTO;
import foxfinance.user.models.UserRequest;
import foxfinance.user.models.UserResponse;
import foxfinance.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    // Declare dependencies
    private final UserRepository userRepository;

    public UserResponse getUser(Integer request){
        UserResponse response = new UserResponse();

        // Find UID
        Optional<User> opn = Optional.ofNullable(userRepository.findByAccountNum(request));
        if (opn.isPresent()) {
            User user = opn.get();

            // Mapping Data
            UserDTO data = new UserDTO();

            // Assign value to data
            data.setFullName(user.getFullName());
            data.setAccountNum(user.getAccountNum());

            // Create a list and add data to it
            List<UserDTO> userList = new ArrayList<>();
            userList.add(data);

            // Assign data to response
            response.setData(userList);
            response.setResultCd(200);
        }

        return response;
    }


    // Get my users
    public UserResponse getMyUser(Integer request){

        // Declare response
        UserResponse response = new UserResponse();
        UserDTO data = new UserDTO();

        // Find account number
        User user = userRepository.findByAccountNum(request);

        if(user.getId().describeConstable().isPresent()){
            // Assign value to data
            data.setId(user.getId());
            data.setFullName(user.getFullName());
            data.setAccountNum(user.getAccountNum());
            data.setCash(user.getCash());
            data.setDob(user.getDob());

            // Create a list and add data to it
            List<UserDTO> userList = new ArrayList<>();
            userList.add(data);

            // Assign data to response
            response.setData(userList);
            response.setResultCd(200);

            return response;
        }else{
            return null;
        }
    }
}
