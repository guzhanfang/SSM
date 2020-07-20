package com.gzf.service.impl;/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/7/20
 * @Introduce
 */

import com.gzf.bean.UserBean;
import com.gzf.mapper.UserMapper;
import com.gzf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName IUserService
 *@Author gzf
 *@Date 2020/7/20 15:26
 *@Description TODO
 */
@Service
public class IUserService implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBean> query() {
        return userMapper.query();
    }
}
