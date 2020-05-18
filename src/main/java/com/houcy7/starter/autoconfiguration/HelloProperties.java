package com.houcy7.starter.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @ClassName HelloProperties
 * @Description 配置文件
 * @Author hou
 * @Date 2020/5/18 10:47 上午
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = HelloProperties.HELLO_FORMAT_PREFIX)
public class HelloProperties {

    public static final String HELLO_FORMAT_PREFIX = "houcy7.format";

    private Map<String, Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

}