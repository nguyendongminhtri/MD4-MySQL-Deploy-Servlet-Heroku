package chinh.com.service.user;

import chinh.com.model.Role;
import chinh.com.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

public interface IUserService {
    boolean existedByUsername(String username);
    boolean existedByEmail(String email);
    void save(User user);
    User userLogin(String username, String password);
    Set<Role> findRoleByUserId(int user_id);
    void updateAvatar(String avatar, int id);
    User getCurrentUser(HttpServletRequest request);
}
