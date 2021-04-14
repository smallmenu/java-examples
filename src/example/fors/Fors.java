package example.fors;

public class Fors {
    public static void main(String[] args) {
        // for 语句第一部分声明 i 变量，这个变量的作用域是 for 循环的整个循环体
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // for each 语句，i 不再是计数器，而是数组每个元素
        int[] ia = {1, 4, 9, 16, 25};
        for (int i : ia) {
            System.out.println(i);
        }
    }
}
