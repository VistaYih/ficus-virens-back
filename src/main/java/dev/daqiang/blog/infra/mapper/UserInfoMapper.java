package dev.daqiang.blog.infra.mapper;

import dev.daqiang.blog.domain.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    UserInfo selectUserInfoById(Long id);
}
