package org.yrdm.delivery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yrdm.delivery.mapper.UserMapper;
import org.yrdm.delivery.pojo.User;
import org.yrdm.delivery.service.UserService;

/**
 * @Author: zbq
 * @Date: 2023/5/11 下午10:45
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
