package com.yangle.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 流操作工具类
 */
public final class StreamUtil {
    private static  final Logger logger= LoggerFactory.getLogger(StreamUtil.class);
/**
 * 从输入流中获取字符串
 */
public static String getString(InputStream is){
    StringBuilder sb=new StringBuilder();
    BufferedReader reader=new BufferedReader(new InputStreamReader(is));
    String line;
    try {
        while ((line=reader.readLine())!=null){
        sb.append(line);
        }
    } catch (IOException e) {
        logger.error("get String failture",e);
        throw new RuntimeException();
    }
    return sb.toString();
}
}
