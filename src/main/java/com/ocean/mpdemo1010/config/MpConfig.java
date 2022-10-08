package com.ocean.mpdemo1010.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MpConfig
 * @Description: configClass
 * @author: ocean
 * @date: 2022/10/8 15:26
 */
@Configuration
@MapperScan("com.ocean.mpdemo1010.mapper")
public class MpConfig {

    //乐观锁插件
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
}
