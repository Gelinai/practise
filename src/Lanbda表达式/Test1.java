package Lanbda表达式;

import java.util.Arrays;
import java.util.List;
//Lambda表达式，用于接口的实现类，接口要有@FunctionalInterface

//https://blog.csdn.net/weixin_43992185/article/details/107452198
/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 10:58 2020/11/17
 * @Modified By:
 */
public class Test1 {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));

// 在 Java 8 中使用双冒号操作符(double colon operator)
        System.out.println("\n测试############");
        players.forEach(System.out::println);
    }
}
