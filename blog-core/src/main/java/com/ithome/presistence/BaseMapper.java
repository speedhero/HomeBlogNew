package com.ithome.presistence;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 公有Mapper
 *
 * @author Rick Jiang
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/4/12 16:26
 * @since 1.0
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
