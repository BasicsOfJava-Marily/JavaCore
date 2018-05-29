package com.marily.javacore.exception.RuntimeException;

/**
 * @ClassName DemoNullPoiterException
 * @Description TODO  空指针异常
 * @Author mayl
 * @Date 2018/5/29 22:27
 * @Version 1.0
 */
public class DemoNullPoiterException {

    /**
     * Exception in thread "main" java.lang.NullPointerException
     * @param args
     */
    public static void main(String[] args) {
        String s=null;
        s.toString();
    }
}
