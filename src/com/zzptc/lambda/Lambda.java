package com.zzptc.lambda;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.lang.reflect.AccessibleObject;
import java.sql.SQLOutput;

/**
 * @author wangqingbo
 * @create 2020-07-16-13:29
 */
public class Lambda {
    public static void test01() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run...");
            }
        }).start();
    }

    public static void test02() {
        new Thread(
                () -> System.out.println("run...")
        ).start();
    }

    public static void main(String[] args) {
//        test01();
        test02();
    }

}
