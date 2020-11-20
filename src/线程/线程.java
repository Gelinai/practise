package 线程;

import java.util.ArrayList;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 11:21 2020/11/7
 * @Modified By:
 */
public class 线程 {
    static final int THREAD_NUMBER = 2;
    static final int LOOP_NUMBER = 200;

    public static void main(String[] args) {
        ThreadUnsafe threadUnsafe = new ThreadUnsafe();
        for (int i = 0; i < THREAD_NUMBER; i++) {
            new Thread(() -> {
                threadUnsafe.method1(LOOP_NUMBER);
            }, "Thread" + (i + 1)).start();
        }
    }
}
class ThreadUnsafe {
    ArrayList<String> list = new ArrayList<>();
    public void method1(int loopNumber) {
        System.out.println("刚开始的list:"+list);
        for (int i = 0; i < loopNumber; i++) {
            method2();
            method3();
        }
    }

    private void method2() {
        list.add(String.valueOf((Math.random()*1000)));
        System.out.println(Thread.currentThread().getName()+":增加1"+"后的list:"+list);
    }

    private void method3() {
        list.remove(0);
        System.out.println(Thread.currentThread().getName()+":移除1"+"后的list:"+list);
    }
}

