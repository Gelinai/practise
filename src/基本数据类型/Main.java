package 基本数据类型;

public class Main {

    public static void main(String[] args) {
        long a1 = 1281321546984l;
        float f =0.2313f;
        short a =12;
        byte b =(byte)a;
        short s1 =1;
        s1=(short)+1;
        s1+=1;
        //System.out.println(b);
        //a1=(a++);
        a=(a++);
        //System.out.println(a1);
        int d = 3>>5>>7;
        int q = 1;
        int t =1;
        if((q++)>1){
            System.out.println(q);
        }else{
            System.out.println("失败");
            if(q>1){
                System.out.println(q);
            }
        }
        System.out.println(t++);

    }
}


