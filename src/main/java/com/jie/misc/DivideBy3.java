import java.util.Random;

public class DivideBy3 {

    static int add(int x, int y) {
        while (x > 0) {
            int t = (x & y) << 1;// 1+1=>10
            y ^= x; // xor
            x = t;
        }
        return y;
    }

    // n = 4 * a + b
    // n / 3 = a + (a + b) / 3
    static int divideBy3(int num) {
        int sum = 0;
        while (num > 3) {
            sum = add(num >> 2, sum);
            num = add(num >> 2, num & 3);
        }
        if (num == 3)
            sum = add(sum, 1);
        return sum;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int r = Math.abs(rand.nextInt());
            if (r / 3 != divideBy3(r)) {
                System.out.println("Wrong: " + r + "/3=" + r / 3 + " <> " + divideBy3(r));
            }
        }
    }
}
