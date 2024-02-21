import java.util.Scanner;

class multipleStr
{
	public String multipleStr(String my_string, int k)
	{
		String ans = new String();
		for (int i = 0; i < k; i++)
			ans += my_string;
		return ans;
	}
}