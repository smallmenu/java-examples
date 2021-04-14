package example.enums;

import source.enums.EnumSize;

public class Enums {
    public static void main(String[] args) {
        // 枚举类的 values 返回所有枚举值数组
        EnumSize[] sizes = EnumSize.values();
        for (EnumSize size : sizes) {
            System.out.println(size);
        }

        // 枚举的比较直接调用 ==
        EnumSize enum1 = EnumSize.DUET;
        EnumSize enum2 = EnumSize.DUET;
        System.out.println(enum1 == enum2);

        // 所有枚举都有 ordinal 方法，返回枚举常量位置，但不推荐使用
        // 应当借助属性实例获取
        System.out.println(enum1.ordinal());
        System.out.println(enum1.value());
    }
}
