package 单例;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 15:19 2020/7/18
 * @Modified By:
 */
/**
 * 懒汉式单例模式
 * @author Administrator
 *
 */
class Singleton{
    private Singleton(){}
    private static Singleton singleton = null;
    //静态方法工厂
    public static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
            //当new对象的时候，调用无参构造函数初始化对象Singleton
        }
        System.out.println("初始化完成"+singleton);
        return singleton;
    }
}
public class Test{
    public static void main(String args[]){
        System.out.println("------开始调用getSingleton()方法-------");
        //Singleton singleton = new Singleton();
        //Singleton.getSingleton();
        System.out.println("------结束-------");
    }
}
