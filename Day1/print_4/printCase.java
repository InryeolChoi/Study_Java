import java.util.Scanner;

public class printCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();
        for (int i = 0; i < a.length(); i++)
        {
            if (97 <= arr[i] && arr[i] <= 122)
                arr[i] = (char)(arr[i] - 32);
            else if (65 <= arr[i] && arr[i] <= 90)
                arr[i] = (char)(arr[i] + 32);
        }
        System.out.println(arr);
		sc.close();
    }	
}