package 多态;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 16:11 2020/11/19
 * @Modified By:
 */
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal();
        //b的声明是多态的体现
        Animal b = new Dog();

        a.move();//1
        b.move();//2
        b.test();//4
        //多态的弊端就是，不能使用子类特有的方法，若非要使用，必须向下转型才行
        //b.bark();

        //转型1：
        Dog d = (Dog) b;
        d.bark();//3
        d.test();//4

        ////这个会报运行错
        //Dog d1 = (Dog) a;

        //转型2：
        ((Dog) b).bark();

    }
}

class Animal{
    public void move(){
        System.out.println("1");
    }

    public void test(){
        System.out.println("4");
    }
}

class Dog extends Animal{

    public void move(){
        System.out.println("2");
    }

    public void bark(){
        System.out.println("3");
    }

}
