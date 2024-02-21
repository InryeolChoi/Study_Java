import java.util.Scanner;

public class printPlus {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum = a + b;
	
	String s = String.format("%d + %d = %d", a, b, sum);
	System.out.println(s);
	sc.close();
}
