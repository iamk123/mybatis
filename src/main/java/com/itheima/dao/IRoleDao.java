package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
public interface IRoleDao {

    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();

    /**
     * 根据用户id查询账户信息
     * @param roleId
     * @return
     */
    Role findRoleByRoleId(Integer roleId);
}
