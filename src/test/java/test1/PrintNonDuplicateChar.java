package test1;

import java.util.LinkedHashSet;

public class PrintNonDuplicateChar {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String a= "abacbdeef";
		char[] b = a.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<b.length;i++)
		{
			if(set.add(b[i])==true)
			{
				System.out.println(b[i]);
			}
		}

	}

}
