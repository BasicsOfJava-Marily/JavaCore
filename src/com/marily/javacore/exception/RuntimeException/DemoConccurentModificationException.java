package com.marily.javacore.exception.RuntimeException;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName DemoConccurentModificationException
 * @Description TODO 同步修改异常，遍历一个集合的时候，删除集合的元素，就会抛出该异常
 * @Author mayl
 * @Date 2018/5/29 22:43
 * @Version 1.0
 */
public class DemoConccurentModificationException {

    /**
     * Exception in thread "main" java.util.ConcurrentModificationException
     * @param args
     */
    public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(2);
                Iterator<Integer> iterator = list.iterator();
                while(iterator.hasNext()){
                    Integer integer = iterator.next();
                    if(integer==2)
                        list.remove(integer);
                }
            }
}
