package 重载;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 20:43 2020/10/20
 * @Modified By:
 */
public class 重载 {
    public static void main(String[] args) {
        Persion p = new Persion("sd");


    }
}

class Persion{
    private String age;

    public Persion(){}

    public Persion(String age){
        this.age =age;
        System.out.println(age);
    }

//    public String Animal(String age){
//        System.out.println("name");
//        return age;
//  }
}