package test1;

public class ReverseAlternativeString {
	public static void main(String[] args) {
		String s="my name is santosh kumar";
		String[] s1 = s.split(" ");
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==1)
			{
				s1[i]=reverse(s1[i]);
			}
		}
		for(int i=0;i<s1.length;i++)
		{
			count++;
			System.out.print(s1[i]+" ");
		}
		System.out.println(count);
	}
	private static String reverse(String st) {
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		return rev;
	}
}
