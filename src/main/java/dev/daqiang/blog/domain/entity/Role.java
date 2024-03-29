package dev.daqiang.blog.domain.entity;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class Role extends BaseEntity {

    private Long id;

    private String roleName;

    private List<Permission> permissions;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return id.equals(role.id) &&
                roleName.equals(role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName);
    }
}
