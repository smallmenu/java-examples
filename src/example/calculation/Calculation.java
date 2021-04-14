package example.calculation;

public class Calculation {
    public static void main(String[] args) {
        // 遵循四则运算规则，可以使用小括号改变优先级
        // 整数数值表示是精确的，运算也是精确的，两个数相除只能得到整数部分
        int a = (100 + 200) * (99 - 88);
        int b = 12345 / 67;

        // 自增自减运算与大部分语言相似
        b++;
        --b;
        b += 2;

        // 移位运算，左移 1 位，相当于是 2 倍
        int c = 7;
        int ca = c << 1;

        // 位运算，按位进行与、或和异或运算
        int da = 0 & 1;
        int db = 1 & 1;
        int dc = 1 | 0;

        // 自动转型，会将两个操作数转换位同一种类型，并且总是向较大类型转换
        // 如：
        int n = 123456789;
        float f = n;
        float nf = n + f;

        // 强制转型，可能会丢失一些信息。
        double x = 9.997;
        int nx = (int)x;

        System.out.println(a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(ca);

        System.out.println(da);
        System.out.println(db);
        System.out.println(dc);

        System.out.println(n);
        System.out.println(f);
        System.out.println(nf);

        System.out.println(x);
        System.out.println(nx);
    }
}
