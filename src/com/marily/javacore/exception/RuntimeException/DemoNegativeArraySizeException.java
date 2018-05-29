package com.marily.javacore.exception.RuntimeException;

/**
 * @ClassName DemoNegativeArraySizeException
 * @Description TODO 为数组分配的空间是负数异常
 * @Author mayl
 * @Date 2018/5/29 22:35
 * @Version 1.0
 */
public class DemoNegativeArraySizeException {

    /**
     * Exception in thread "main" java.lang.NegativeArraySizeException
     * @param args
     */
    public static void main(String[] args) {
        String [] s=new String[-1];
    }
}
