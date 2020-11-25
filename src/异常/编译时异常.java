package 异常;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 12:21 2020/11/21
 * @Modified By:
 */
public class 编译时异常 {
    public static void main(String[] args) {
        try{
            int a = 1;
            a=a/0;

        }catch(Exception e){
            e.printStackTrace();
            //System.out.println(e);
            //throw e;
            //throw new ArithmeticException("fdg");
            //throw new NullPointerException("fdg");
            //System.out.println();
        }
//        int a = 1;
//        a=a/0;
        System.out.println("end");
    }

    //编译时异常
    //https://www.cnblogs.com/william-dai/p/9255158.html
    public static void copy(String yuan,String mulu){
        File yuanFile = new File(yuan);
        File muluFile = new File(mulu);
    //看一个异常是运行时还是编译时异常，最简单的方法是看他的父类或者看他的爷爷、太爷爷...（开个玩笑）是不是RuntimeException。
    //比较通俗易懂的方法是，你把代码写出来之后，有红色波浪线提示你抛出或捕获异常，这个时候正处于编译阶段，所以是编译时异常
        try {
            FileInputStream fin = new FileInputStream(yuanFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fout = new FileInputStream(muluFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
