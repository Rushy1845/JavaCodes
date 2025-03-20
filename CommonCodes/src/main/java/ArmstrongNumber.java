public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, n = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(num + " is Armstrong: " + isArmstrong(num));
    }
}
