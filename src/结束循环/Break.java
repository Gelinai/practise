package 结束循环;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 17:46 2020/7/17
 * @Modified By:
 */
public class Break {
    public static void main(String[] args){
        flat:
        for(int i = 0;i < 5;i++){
            for(int j =0;j<5;j++){
                if(j>=2){
                    break flat;
                }
                System.out.println(j);
            }
        }
        System.out.println("break");
    }
}
