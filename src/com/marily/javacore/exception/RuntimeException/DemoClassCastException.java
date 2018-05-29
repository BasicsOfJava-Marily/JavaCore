package com.marily.javacore.exception.RuntimeException;

/**
 * @ClassName DemoClassCastException
 * @Description TODO 类型转换异常
 * @Author mayl
 * @Date 2018/5/29 22:24
 * @Version 1.0
 */
public class DemoClassCastException {

    /**
     * Exception in thread "main" java.lang.ClassCastException:
     * java.lang.Integer cannot be cast to java.lang.String
     * @param args
     */
    public static void main(String[] args) {
        Object o=new Integer(0);
        String s=(String)o;

    }
}
