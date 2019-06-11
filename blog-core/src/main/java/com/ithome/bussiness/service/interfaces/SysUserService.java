package com.ithome.bussiness.service.interfaces;

import com.github.pagehelper.PageInfo;
import com.ithome.bussiness.entity.User;
import com.ithome.bussiness.entity.UserPwd;
import com.ithome.bussiness.vo.UserConditionVO;
import com.ithome.framework.object.AbstractService;

import java.util.List;

public interface SysUserService extends AbstractService<User, Long> {


    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<User> findPageBreakByCondition(UserConditionVO vo);

    /**
     * 更新用户最后一次登录的状态信息
     *
     * @param user
     * @return
     */
    User updateUserLastLoginInfo(User user);

    /**
     * 根据用户名查找
     *
     * @param userName
     * @return
     */
    User getByUserName(String userName);

    /**
     * 通过角色Id获取用户列表
     *
     * @param roleId
     * @return
     */
    List<User> listByRoleId(Long roleId);

    /**
     * 修改密码
     *
     * @param userPwd
     * @return
     */
    boolean updatePwd(UserPwd userPwd) throws Exception;

}
