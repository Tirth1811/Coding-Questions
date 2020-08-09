package interviewBit;
import java.math.BigInteger;
import java.util.Scanner;

///Given a number A. Find the fatorial of the number.
public class Large_Factorial {
	public static String solve(int A) {
		BigInteger fact=new BigInteger("1");
        for(int i=2;i<=A;i++) {
        	fact = fact.multiply(new BigInteger(String.valueOf(i))); 
        }
        return String.valueOf(fact);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String s = solve(number);
		System.out.println(s);
	}
}
