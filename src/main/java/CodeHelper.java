public class CodeHelper {

    public static int age;
    private int num;
    private String str;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void age() {
        if (age <= 15) {
            System.out.println("Don't hire");
        } else if (age >= 16 && age <= 17) {
            System.out.println("Can hire on a part-time basis only");
        } else if (age >= 18 && age <= 54) {
            System.out.println("Can hire as a full-time employee");
        } else if (age >= 55) {
            System.out.println("Don't hire*");
        }
    }
}