package com.houcy7.starter.format;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName JsonFormatProcessor
 * @Description TODO
 * @Author hou
 * @Date 2020/5/17 10:26 下午
 * @Version 1.0
 **/
public class JsonFormatProcessor implements FormatProcessor{

    @Override
    public <T> String format(T object) {
        return "JsonFormatProcessor: " + JSONObject.toJSONString(object);
    }
}