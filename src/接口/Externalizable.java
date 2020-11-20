package 接口;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 16:26 2020/7/17
 * @Modified By:
 */

//参考博客：https://blog.csdn.net/h294590501/article/details/80303722?utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~sobaiduend~default-1-80303722.nonecase&utm_term=%E6%8E%A5%E5%8F%A3%E6%96%B9%E6%B3%95%E9%BB%98%E8%AE%A4
public interface Externalizable extends Serializable {

    //成员变量的默认都是public static final
    int a = 5;

    //接口中的方法默认都是public、abstract类型的
    void writeExternal(ObjectOutput out) throws IOException;

    void readExternal(ObjectInput in) throws IOException, ClassNotFoundException;

    //以前创建了一个接口，并且已经被大量的类实现。
    //如果需要再扩充这个接口的功能加新的方法，就会导致所有已经实现的子类需要重写这个方法。
    //如果在接口中使用默认方法就不会有这个问题。
    //所以从 JDK8 开始新加了接口默认方法，便于接口的扩展。

    //默认方法使用 default 关键字，一个接口中可以有多个默认方法。
    //接口中既可以定义抽象方法，又可以定义默认方法，默认方法不是抽象方法。
    //子类实现接口的时候，可以直接调用接口中的默认方法，即继承了接口中的默认方法。

    default void getaa(){
        System.out.println("这是接口中的默认方法");
    }

    //接口中同时还可以定义静态方法，静态方法通过接口名调用。
    static void getas(){
        System.out.println("这是接口中的静态方法");
    }
}
