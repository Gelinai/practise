package for的用法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 11:06 2020/11/17
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("bb");
        names.add("jj");
        for(String name:names){//这种方法不能用于赋值
            name = "hh";
        }
        System.out.println(Arrays.toString(names.toArray()));
        for(int i = 0;i<names.size();i++) names.set(i,"hh");//赋值要用完整的for
        System.out.println(Arrays.toString(names.toArray()));
        String s[] = {"1","2"};

        for(int i =0;i<s.length;i++){
            String a =s[i];
            a = new String("aa");
            System.out.println(s[i]);
        }

    }
}
