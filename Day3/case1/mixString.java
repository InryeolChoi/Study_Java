import java.util.Scanner;

class mixString
{
	public static void main(String[] args)
	{
		String str1 = "hello";
		String str2 = "apple";
		
		String str3 = solution(str1, str2);
		System.out.println(str3);
	}

	public static String solution(String str1, String str2)
	{
        String answer = new String();
        for (int i = 0; i < str1.length(); i++)
        {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            answer += (a + "" + b + "");
        }
        return (answer);
    }
}