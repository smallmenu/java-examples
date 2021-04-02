package example.type;

public class Type {
    public static void main(String[] args) {
        // 基本数据类型
        // 整数类型，均是带符号（允许负值），并且和平台无关
        // int 占用 4 字节，Java7 可以使用下划线字面量，更易读
        int i = 1;
        int ia = 123_0000;

        // short 占用 2 字节，long 占用 8 字节，byte 占用 1 字节
        short s = 2;
        long l = 3L;
        byte b = 4;

        // 浮点类型，float 占用 4 字节，double 占用 8 字节
        // 没有后缀 F 会默认为double 类型
        float f = 3.14F;
        double d = 3.14D;

        // char 占用 2 字节
        // 字符类型不仅可以表示 ASCII 字符，还可以表示 Unicode 字符
        // 但是有些 Unicode 可以用一个 char 描述，有些需要两个 char 值
        char c = 'a';
        char zh = '汉';

        // 布尔类型
        boolean bool = true;

        // 基本类型所对应的包装类
        Integer iInteger = i;
        Boolean iBoolean = bool;

        // 基本类型对应的包装类：Integer、Boolean、Long...
        // 通过包装类的定义，整型 int 位宽是 32，占用 4 个字节
        // 表示的值范围是：-2147483648 至 2147483647
        int iSize = Integer.SIZE;
        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;

        // 结果输出
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);
        System.out.println(b);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c);
        System.out.println(zh);

        System.out.println(bool);
        System.out.println(iInteger);
        System.out.println(iBoolean);

        System.out.println(iSize);
        System.out.println(iMin);
        System.out.println(iMax);
    }
}
