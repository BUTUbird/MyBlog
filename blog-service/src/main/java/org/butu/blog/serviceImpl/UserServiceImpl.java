package org.butu.blog.serviceImpl;

import org.butu.blog.entity.User;
import org.butu.blog.mapper.UserMapper;
import org.butu.blog.api.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BUTUbird
 * @since 2022-01-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
