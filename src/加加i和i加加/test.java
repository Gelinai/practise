package 加加i和i加加;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 1:02 2020/7/21
 * @Modified By:
 */
public class test {
    int a =1;
    int c =2;
    //c=a+c;
    public static void main(String []args){
        int i = 0;
        int b = 0;
        b = i++;
        //System.out.println(b); //0
        //System.out.println(i); //1
        b = i++;
        //System.out.println(b); //1
        //System.out.println(i); //2
        int a = 0,c=0;
        for (int j = 0; j < 99; j++) {
            c = a ++;
        }
        System.out.println(c);
    }

}
