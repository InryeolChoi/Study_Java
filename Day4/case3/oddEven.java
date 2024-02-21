import java.lang.Math;

class oddEven
{
	public int solution(int n)
	{
		if (n % 2 == 1)
			return math.pow(n / 2 + 1, 2);
		else
		{
			n /= 2;
			return 2 * n * (n+1) * (2*n + 1) / 3;
		}
	}
}