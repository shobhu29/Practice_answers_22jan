import java.util.Scanner;
public class Anagram {
	
	public static void main(String[] args) {		
		
		Scanner sc= new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
		int l1=s1.length();
		int l2=s2.length();
		int not_count=0;
		if (l1==l2)
		{	
			for(int i=0;i<l1;i++)
			{	
				int count =0;
				for(int j=0;j<l2;j++)
				{
					if (s1.charAt(i)==s2.charAt(j))
					{
						count=1;
						break;
					}
				}
				if(count==0)
				{
				not_count=1;
				break;
				}	
			}
			
			if (not_count==1)
				System.out.println("Strings are not anagram" );
			else
				System.out.println("Strings are anagram" );
		}	
		else
			System.out.println("strings are not of same length");
		}
}

