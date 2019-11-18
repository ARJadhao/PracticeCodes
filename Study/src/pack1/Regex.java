package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".am");
		Matcher m = p.matcher("Rfam");
		if(m.matches())
		{
			System.out.println("Yeahh!!!");
		}
		else
		{
			System.out.println("Nahh!!");
		}

		
	}

}
