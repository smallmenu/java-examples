package example.constants;

public class Constants {
    // 类常量，可以在多个方法中使用。声明为 public 则其他类方法也可以使用
    public static final int MAX = 10;

    public static void main(String[] args) {
        // 关键字 final 表示常量，只能被赋值一次，常量习惯使用全大写
        final double PI = 3.1415926;

        System.out.println(PI);
        System.out.println(Constants.MAX);
        System.out.println(Math.PI);
    }
}
