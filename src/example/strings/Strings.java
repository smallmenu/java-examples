package example.strings;

public class Strings {
    public static void main(String[] args) {
        // 创建了字符串 "name" 在字符串池中，string1 与 string2 都是对该字符串的引用
        String string1 = "java";
        String string2 = "java";

        // String 对象，默认为引用赋值，string3 与 string4 引用同一个对象
        String string3 = new String("java");
        String string4 = string3;

        // 比较字符串对象
        System.out.println(string1 == string2);
        System.out.println(string1 == string3);
        System.out.println(string3 == string4);

        // 比较字符串的值
        System.out.println(string1.equals(string3));
        System.out.println(string1.equalsIgnoreCase(string3));

        // 字符串长度，中、英文、标点的长度都是 1
        String s1 = "hello，中国.";
        System.out.println(s1.length());

        // 数值转换字符串
        String s2 = String.valueOf(123.12);
        System.out.println(s2);

        // 避免空指针异常
        System.out.println("java".equals(string1));

        // String 类内置方法
        System.out.println("java".toUpperCase());
        System.out.println("java".startsWith("ja"));
        System.out.println("java".indexOf("a"));
        System.out.println("java".contains("v"));
    }
}
