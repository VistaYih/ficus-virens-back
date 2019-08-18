package dev.daqiang.blog.domain.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class Permission extends BaseEntity {

    private Integer id;

    private String permissionName;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission that = (Permission) o;
        return id.equals(that.id) &&
                permissionName.equals(that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionName);
    }


}
