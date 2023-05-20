package chinh.com.service.role;

import chinh.com.model.Role;
import chinh.com.model.RoleName;

public interface IRoleService {
    Role findByName(RoleName name);
}
