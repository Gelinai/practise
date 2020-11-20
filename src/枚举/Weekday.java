package 枚举;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 16:36 2020/7/18
 * @Modified By:
 */
public enum Weekday {
    SUN(0),MON(1),TUS(2),WED(3),THU(4),SAT(6),FRI(5);

    private int value;

    private Weekday(int value){
        this.value = value;
    }

    public static Weekday getNextDay(Weekday nowDay){
        int nextDayValue = nowDay.value;

        if (++nextDayValue == 7){
            nextDayValue =0;
        }

        return getWeekdayByValue(nextDayValue);
    }

    public static Weekday getWeekdayByValue(int value) {
        for (Weekday c : Weekday.values()) {
            if (c.value == value) {
                return c;
            }
        }
        return null;
    }
}

class Test2{
    public static void main(String[] args) {
        System.out.println("nowday ====> " + Weekday.SAT);
        System.out.println("nowday int ====> " + Weekday.SAT.ordinal());
        System.out.println("nextday ====> " + Weekday.getNextDay(Weekday.SAT)); // 输出 SUN

        //输出：
        //nowday ====> SAT
        //nowday int ====> 5
        //nextday ====> SUN
    }
}

