package com.ithome.bussiness.vo;

import com.ithome.bussiness.entity.User;
import com.ithome.framework.VO.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Rick jiang (speedhero@126.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserConditionVO extends BaseConditionVO {
    private User user;
}
