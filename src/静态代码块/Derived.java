package 静态代码块;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 11:08 2020/7/17
 * @Modified By:
 */
class Base{
    static{
        System.out.println("静态代码块.Base static block");
    }
    {
        System.out.println("静态代码块.Base block");
    }
    public Base(){
        System.out.println("静态代码块.Base constructor");
    }

}

public class Derived extends Base{
    static{
        System.out.println("静态代码块.Derived static block");
    }
    {
        System.out.println("静态代码块.Derived block");
    }
    public Derived(){
        System.out.println("静态代码块.Derived constructor");
    }
    public static void main(String args[]){
        new Derived();
    }
}
