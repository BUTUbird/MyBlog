package org.butu.blog.mapper;

import org.butu.blog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BUTUbird
 * @since 2022-01-18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
