package com.ithome.presistence.mapper;

import com.ithome.framework.VO.RoleConditionVO;
import com.ithome.presistence.BaseMapper;
import com.ithome.presistence.beans.SysRole;

import java.util.List;

public interface SysRoleMapper extends BaseMapper<SysRole> {
    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    List<SysRole> findPageBreakByCondition(RoleConditionVO vo);

    List<SysRole> queryRoleListWithSelected(Integer userId);

    List<SysRole> listRolesByUserId(Long userId);
}