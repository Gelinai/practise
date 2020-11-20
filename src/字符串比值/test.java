package 字符串比值;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 10:53 2020/7/21
 * @Modified By:
 */
public class test {
    public static void main(String []args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);

    }
}
