class summation
{
	public int solution(int a, int b)
	{
		String x = String.valueOf(a);
		String y = String.valueOf(b);
		
		int x1 = Integer.valueOf(x);
		int y1 = Integer.valueOf(y);
		return x1 > y1 ? x1 : y1;
	}
}