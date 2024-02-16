# DAY 1
## 기본세팅
```
1. 한 클래스 당 public class는 1개.
2. public class에 main이 들어갈 수 있음.
3. 기본 입력 : Scanner 클래스 사용
	1. Scanner 클래스의 객체를 인스턴스화
	2. 내부 메소드로 입력/출력 받기
	3. 다 쓰고 해당 객체 닫기 = fd 회수.
```

## 1번
- Scanner 클래스 활용해서 입력 받고 출력.

## 2번
- 마찬가지로 풀면 된다.
- System.out.println() 안에서는 string끼리 더할 수 있다.

## 3번
- for문으로 반복해서 출력

## 4번
1. string -> char[]로 바꿔서 풀기.
	1. string.toCharArray()를 써서 바꾼다.
	2. Array에 하나하나 접근해 가면서 

2. string만으로 풀기
	1. 새로운 String인 result 선언
	2. 개선된 for문을 이용, 괄호 안에 char x : str.toCharArray() 넣기
	3. 결과 출력.

```java
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String result = "";

	for (char x : str.toCharArray())
	{
		if (Character.isLowerCase(x))
			result += Character.toUpperCase(x);
		else
			result += Character.toLowerCase(x);
	}
	System.out.println(result);
```