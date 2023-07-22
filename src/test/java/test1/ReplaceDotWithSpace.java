package test1;

public class ReplaceDotWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My.name.santosh.kumar.A";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='.')
			{
				ch=' ';
			}
			System.out.print(ch);
		}
		
		

	}

}
