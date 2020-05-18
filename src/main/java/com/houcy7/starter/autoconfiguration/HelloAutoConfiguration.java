package com.houcy7.starter.autoconfiguration;

import com.houcy7.starter.HelloFormatTemplate;
import com.houcy7.starter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName HelloConfiguration
 * @Description TODO
 * @Author hou
 * @Date 2020/5/17 10:43 下午
 * @Version 1.0
 **/
@Import({FormatConfiguration.class})
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(FormatProcessor processor, HelloProperties helloProperties) {
        return new HelloFormatTemplate(processor, helloProperties);
    }
}