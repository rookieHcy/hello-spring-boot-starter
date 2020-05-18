package com.houcy7.starter.autoconfiguration;

import com.houcy7.starter.format.FormatProcessor;
import com.houcy7.starter.format.JsonFormatProcessor;
import com.houcy7.starter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassName FormatConfiguration
 * @Description TODO
 * @Author hou
 * @Date 2020/5/17 10:39 下午
 * @Version 1.0
 **/
@Configuration
public class FormatConfiguration {

    // 如果环境中没有这个指定的类 会被装配的就是这个
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSONObject")
    @Primary
    @Bean
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor();
    }


    @Bean
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor();
    }
}