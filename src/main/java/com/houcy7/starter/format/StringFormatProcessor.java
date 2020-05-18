package com.houcy7.starter.format;

/**
 * @ClassName StringFormatProcessor
 * @Description TODO
 * @Author hou
 * @Date 2020/5/17 10:26 下午
 * @Version 1.0
 **/
public class StringFormatProcessor implements FormatProcessor{

    @Override
    public <T> String format(T object) {
        return "StringFormatProcessor: " + object.toString();
    }
}