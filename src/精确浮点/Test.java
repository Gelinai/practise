package 精确浮点;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 10:41 2020/7/19
 * @Modified By:
 */
public strictfp class Test {
    public static void testStrictfp(){
        float f = 0.10003f;
        double d = 0.0300468d;
        double sum = f+d;
        System.out.println(sum);
        System.out.println(f);
        System.out.println(d);
    }
    public static void main(String [] args){
        testStrictfp();
    }
}
