package 重载;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 21:16 2020/10/20
 * @Modified By:
 */
public class Animal {
    public static void main(String[] args) {
        Animal a = new Animal();
    }
    private String age;

    public void Animal(){}

    public void Animal(String age){
        this.age =age;
        System.out.println(age);
    }
}
