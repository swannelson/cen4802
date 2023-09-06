import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What term of the Fibonacci sequence to calculate to?");
        //Insert the number for the scanner to calculate the Recursive formula
        int n = scan.nextInt();
        RecursiveFib fn = new RecursiveFib();
        //Calculate Recursive in the out print
        System.out.println("The " + n + " term of the Fibonacci sequence is " + fn.calculate(n));
    }

}
//the recursive formula of Fibonacci
class RecursiveFib {
    public int calculate(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);

    }
}