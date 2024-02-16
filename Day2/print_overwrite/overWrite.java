public class overWrite
{
	String before = my_string.substring(0, s);
	String after = my_string.substring(s + overwrite_string.length());
	return before + overwrite_string + after;
}