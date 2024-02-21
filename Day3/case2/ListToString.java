class ListToString
{
	pubilc String solution(String[] arr)
	{
		String answer = new String();
		for (String s : arr)
			answer += s;
		return answer;
	}
}
