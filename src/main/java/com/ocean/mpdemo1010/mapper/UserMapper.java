package com.ocean.mpdemo1010.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ocean.mpdemo1010.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserMapper
 * @Description: User接口   继承BaseMapper  即可使用增删改查方法
 * @author: ocean
 * @date: 2022/10/8 10:22
 */
//继承BaseMapper  即可使用增删改查方法
@Repository
public interface UserMapper extends BaseMapper<User> {
}
