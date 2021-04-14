package example.variables;

public class Variables {
    public static void main(String[] args) {
        // 变量必须是以字母开头，大小写敏感，不过Java 中的 "字母" 范围很大（如包含下划线_）
        int _a;
        double salary;

        // 可以在一行声明多个变量（不推荐）
        int i, j;

        // 声明变量后，必须使用赋值语句进行显式初始化，也可以声明时同时初始化
        int a = 12;
    }
}
