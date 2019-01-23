import java.util.Scanner;
public class Panagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		boolean count[]=new boolean[26];
		int index=0,flag=1;
		int l=str.length();
		int i;
		for(i=0;i<l;i++)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i)<='Z' )
				index=str.charAt(i) - 'A';
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z' )
				index=str.charAt(i) - 'a';
		
			count[index]=true;
		}
		
		for(i=0;i<26;i++)
		{
			if (count[i]== false)
				flag=0;
		}
		
		if (flag==1)
			System.out.println("Found A Panagram");
		else
			System.out.println("Not Panagram");
		
	}

}
