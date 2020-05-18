package com.houcy7.starter.format;

/**
 * @InterfaceName FormatProcessor
 * @Description TODO
 * @Author hou
 * @Date 2020/5/17 10:25 下午
 * @Version 1.0
 **/
public interface FormatProcessor {
    <T> String format(T object);
}
