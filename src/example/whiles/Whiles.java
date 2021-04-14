package example.whiles;

public class Whiles {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        // continue 语句
        int j = 0;
        while (j < 10) {
            j++;
            if (j % 2 == 0) {
                continue;
            } else {
                System.out.println(j);
            }
        }

        // break 语句
        int k = 10;
        while (true) {
            System.out.println(k);
            if (++k > 15) {
                break;
            }
        }
    }
}
