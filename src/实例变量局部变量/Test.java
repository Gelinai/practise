package 实例变量局部变量;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 15:46 2020/7/18
 * @Modified By:
 */
//实例变量：每当实例化一个对象时，会创建一个副本并初始化，如果没有显示初始化，那么会初始化一个默认的值
//局部变量： 在方法中定义的变量，在使用前必须初始化。
    
//局部变量：因为局部变量 本身就是 一个访问权限 的设定。 只能在局部调用，
// 也就是说局部变量的生命周期在{}之中除了这个方法外界是没办法访问你这个变量，所以不需要用任何修饰符修饰，
// 比如private ,public protected,等但是能加final,也不能加static,静态的关键词
public class Test {
    public int a;
    public void print(){
        int b =1;
        //int b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        Test t = new Test();
        t.print();
    }
}
