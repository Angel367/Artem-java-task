package mirea.artemtask.Services;

import mirea.artemtask.Entities.Role;
import org.springframework.security.core.userdetails.UserDetailsService;
import mirea.artemtask.Controllers.dto.UserRegistrationDTO;
import mirea.artemtask.Entities.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO UserRegistrationDTO);
    User save(User user);
    List<User> getUsers();
}
