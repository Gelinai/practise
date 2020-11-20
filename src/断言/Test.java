package 断言;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 18:24 2020/7/17
 * @Modified By:
 */
public class Test {
    public static void main(String [] args){
        assert 1+1==2;
        System.out.println("assert1 ok");
        assert 1+1==3:"assert faild,exit";
        System.out.println("assert2 ok");
    }
}
