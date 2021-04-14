package example.ifs;

public class Ifs {
    public static void main(String[] args) {
        // if-else 语句
        if (7 % 2 == 0) {
            System.out.println("7 is even");
        } else {
            System.out.println("7 is odd");
        }

        // if-else if-else 语句
        int num = 9;
        if (num < 0) {
            System.out.println("negative");
        } else if (num < 10) {
            System.out.println("1 digit");
        } else {
            System.out.println("multiple digits");
        }

        // 三目运算符
        int n = 5 > 6 ? 3 : 2;
        System.out.println(n);
    }
}
