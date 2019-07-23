package com.dubbo.api;

import com.dubbo.entity.UserDO;

import java.util.List;

public interface UserService {
    /**
     * 通过id查询用户
     * @param id
     * @return T
     */
    public UserDO findById(Long id);

    /**
     * 查询用户列表
     * @return T
     */
    public List<UserDO> listUser();
}
