public class recursion6 {

    public static int calpow(int x, int n) {  //used logn stack height

        // base cases
        if (x == 0) return 0;
        if (n == 0) return 1;

        // recursive call only ONCE
        int halfPower = calpow(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calpow(x, n);
        System.out.println("The answer is: " + ans);
    }
}
