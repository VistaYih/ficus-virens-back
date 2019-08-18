package dev.daqiang.blog.infra.mapper;

import dev.daqiang.blog.domain.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<Permission> selectAllPermission();

    Permission selectPermissionByRoleName(String roleName);

    Integer insertPermission(String permission);

    Integer deletePermission(String permission);

    Integer updatePermission(String permission);
}
