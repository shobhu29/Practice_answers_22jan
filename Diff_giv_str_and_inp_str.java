import java.util.Scanner;
public class Diff_giv_str_and_inp_str {
	
	
	public static String difference(String str1,String str2){
		
		char ch[]=str2.toCharArray();
		boolean count[] = new boolean[26];
		int l1=ch.length;
		int l2=count.length;
		char ans[] = new char[26];
		int i,index=0;
		for(i=0;i<l1;i++)
		{
			if(str1.charAt(i) >= 'A' && str1.charAt(i)<='Z' )
				index=str1.charAt(i) - 'A';
			else if(str1.charAt(i) >= 'a' && str1.charAt(i)<='z' )
				index=str1.charAt(i) - 'a';
		
			count1[index]=true;
		}
		for(i=0;i<l2;i++)
		{
			if(str2.charAt(i) >= 'A' && str2.charAt(i)<='Z' )
				index=str2.charAt(i) - 'A';
			else if(str2.charAt(i) >= 'a' && str2.charAt(i)<='z' )
				index=str2.charAt(i) - 'a';
		
			count2[index]=true;
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		System.out.println(difference(str1,str2));
		
	}

}
