package com.ithome.presistence.mapper;

import com.ithome.framework.VO.ResourceConditionVO;
import com.ithome.presistence.BaseMapper;
import com.ithome.presistence.beans.SysResources;

import java.util.List;
import java.util.Map;

public interface SysResourcesMapper extends BaseMapper<SysResources> {
    List<SysResources> findPageBreakByCondition(ResourceConditionVO vo);

    List<SysResources> listUserResources(Map<String, Object> map);

    List<SysResources> queryResourcesListWithSelected(Long rid);

    List<SysResources> listUrlAndPermission();

    List<SysResources> listAllAvailableMenu();

    List<SysResources> listByUserId(Long userId);
}