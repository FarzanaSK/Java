package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		
		Pattern P = Pattern.compile("ab");
		Matcher m = P.matcher("abcdabbaabasdd");
		int count =0;
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"...."+m.end()+"...."+m.group());
			
			
		}
		
		
		
	}

}
