package dev.daqiang.blog.domain.entity;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Objects;

@Data
@Alias("User")
public class User extends BaseEntity {

    private Long id;

    private String username;

    private String password;

    private List<Role> roles;

    private UserInfo userInfo;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", lastUpdateBy=" + lastUpdateBy +
                ", lastUpdateTime=" + lastUpdateTime +
                ", objectVersionNumber=" + objectVersionNumber +
                '}';
    }
}
