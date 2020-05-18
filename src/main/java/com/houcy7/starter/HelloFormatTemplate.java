package com.houcy7.starter;

import com.houcy7.starter.autoconfiguration.HelloProperties;
import com.houcy7.starter.format.FormatProcessor;

/**
 * @ClassName HelloFormatTemplate
 * @Description TODO
 * @Author hou
 * @Date 2020/5/17 10:34 下午
 * @Version 1.0
 **/
public class HelloFormatTemplate {

    private HelloProperties helloProperties;
    private FormatProcessor formatProcessor;

    public HelloFormatTemplate(FormatProcessor formatProcessor, HelloProperties helloProperties) {
        this.formatProcessor = formatProcessor;
        this.helloProperties = helloProperties;
    }

    public <T> String doFormat(T object) {
        return "Execute format: <br/>" +
                "obj format result: " + formatProcessor.format(object) + "<br/>" +
                "info format result: " + formatProcessor.format(helloProperties.getInfo());
    }
}