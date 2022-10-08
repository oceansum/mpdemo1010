package com.ocean.mpdemo1010;

import com.ocean.mpdemo1010.entity.User;
import com.ocean.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Mpdemo1010ApplicationTests {

    @Autowired
    public UserMapper userMapper;

    //查询user表所有数据
    @Test
    void findAll() {   //public 加不加都可以
        List<User> users = userMapper.selectList(null);
        System.out.println("users:" + users);
    }

    //添加用户
    @Test
    public void addUser() {
        User user = new User();
        user.setAge(19);
        user.setEmail("123456789@123");
//        user.setId(12L);  mp会自动生成id

//        user.setCreateTime(new Date());
//        user.setUpdateTime(new Date());

        user.setName("xh");
        int insert = userMapper.insert(user);
        System.out.println(insert);

    }

    //修改用户
    @Test
    public void update() {
        User user = new User();
        user.setAge(20);
        user.setEmail("123456789@123");
        user.setId(1578650477501976577L);
        user.setName("xiao");
        int i = userMapper.updateById(user);
        System.out.println("i" + i);
    }

    //测试乐观锁
    @Test
    public void testOptimisticLocker() {
        User user = userMapper.selectById(1578650477501976577L);
        user.setAge(20);
        user.setEmail("123456789@123");
        user.setName("xiao");
        int i = userMapper.updateById(user);
        System.out.println("i" + i);
    }

    //多个id批量查询
    @Test
    public void testSelectDemo() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2));
        System.out.println(users);
    }

    //

}
