package example.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 只是声明了变量，并不是真正的数组
        int[] a1;

        // 声明并初始化数组，数组一旦创建大小不可改变
        // 数组元素会自动初始化，如 int 初始化为 0, boolean 初始化为 false，对象初始化为 null
        //
        int[] a2 = new int[10];

        // 直接定义数组初始化元素，会自动推算数组大小
        // 使用 new int[] 可以不创建新变量情况下重新初始化一个数组
        int[] a3 = {23, 24, 37, 45, 68};
        a3 = new int[] {27, 19, 31, 9, 13};

        // 多维数组，Java 实际没有多维数组，magic 实际上有点类似于 C++ 中的指针数组 int** magic = new int*[];
        int[][] magic = {
                {16, 2, 13},
                {5, 10, 8}
        };

        // 数组的 length 表示长度大小，可以用来以此下标遍历
        // 数组索引从 0 开始，如果越界访问会抛出异常
        for (int i = 0; i < a3.length; i++) {
            System.out.println(a3[i]);
        }
        System.out.println(a3[0]);
        System.out.println(Arrays.toString(a2));

        // 数组本身是引用类型，对 refA3 的修改会影响原数组
        int[] refA3 = a3;
        refA3[2] = 100;
        System.out.println(Arrays.toString(refA3));
        System.out.println(Arrays.toString(a3));

        // 使用 Arrays.copyOf 实现数组的拷贝
        int[] copyA3 = Arrays.copyOf(a3, a3.length);
        copyA3[2] = 200;
        System.out.println(Arrays.toString(copyA3));
        System.out.println(Arrays.toString(a3));

        // Arrays.copyOf 还可以实现数组长度扩容，扩容后的元素同样会进行初始化
        copyA3 = Arrays.copyOf(copyA3, 2 * copyA3.length);
        System.out.println(Arrays.toString(copyA3));

        // Arrays.sort 使用经过调优的快速排序算法
        Arrays.sort(copyA3);
        System.out.println(Arrays.toString(copyA3));

        // Arrays.binarySearch 前提是数组已经排序，使用二分查找指定元素，并返回索引
        int index = Arrays.binarySearch(copyA3, 27);
        System.out.println(index);

    }
}
