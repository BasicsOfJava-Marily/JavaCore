package com.marily.javacore.exception.RuntimeException;

/**
 * @ClassName DemoArithmeticException
 * @Description TODO  算数异常：比如除数为0
 * @Author mayl
 * @Date 2018/5/29 22:28
 * @Version 1.0
 */
public class DemoArithmeticException {

    /**
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     * @param args
     */
    public static void main(String[] args) {
        int a=9/0;
    }
}
