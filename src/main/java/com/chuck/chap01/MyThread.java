package com.chuck.chap01;

/**
 * @BelongsProject: study
 * @BelongsPackage: com.chuck.chap01
 * @Author: 上青天
 * @CreateTime: 2023-05-22  16:46
 * @Description: TODO
 * @Version: 1.0
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread!");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("程序运行结束！");
    }
}
