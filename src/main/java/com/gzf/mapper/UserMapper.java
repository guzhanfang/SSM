package com.gzf.mapper;

import com.gzf.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/7/20
 * @Introduce
 */
@Mapper
public interface UserMapper {
    List<UserBean> query();
}
