package com.ithome.presistence.mapper;

import com.ithome.bussiness.vo.UserConditionVO;
import com.ithome.presistence.BaseMapper;
import com.ithome.presistence.beans.SysUser;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> findPageBreakByCondition(UserConditionVO vo);

    List<SysUser> listByRoleId(Long roleId);
}