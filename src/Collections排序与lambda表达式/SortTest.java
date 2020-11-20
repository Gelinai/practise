package Collections排序与lambda表达式;

import java.util.*;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 15:18 2020/11/17
 * @Modified By:
 */
public class SortTest {
    class Dog {
        public int age;
        public String name;

        public Dog(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog [age=" + age + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new SortTest().new Dog(5, "DogA"));
        list.add(new SortTest().new Dog(6, "DogB"));
        list.add(new SortTest().new Dog(7, "DogC"));
        Collections.sort(list, new Comparator<Dog>() {

            @Override
            public int compare(Dog o1, Dog o2) {
                return o2.age - o1.age;//这是降序，return o2.age - o1.age这是升序
            }
        });
        System.out.println("给狗狗按照年龄倒序：" + list);

        //写法1
//      Collections.sort(list, new Comparator<Dog>() {
//
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.name.compareTo(o2.name);//这是升序，return o1.age-o2.age这是降序
//            }
//        });

        //写法2
        Collections.sort(list, (Dog o1, Dog o2) ->{
                return o1.name.compareTo(o2.name);
        });


        System.out.println("给狗狗按名字字母顺序排序：" + list);
    }
}
