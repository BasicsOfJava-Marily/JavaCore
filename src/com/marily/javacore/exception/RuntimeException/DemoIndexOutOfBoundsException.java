package com.marily.javacore.exception.RuntimeException;

/**
 * @ClassName DemoIndexOutOfBoundsException
 * @Description TODO  数组下标越界异常
 * @Author mayl
 * @Date 2018/5/29 22:30
 * @Version 1.0
 */
public class DemoIndexOutOfBoundsException {

    /**
     * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
     * @param args
     */
    public static void main(String[] args) {
        int[] a={1};
        int b=a[1];
    }


}
