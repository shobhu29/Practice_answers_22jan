import java.util.Scanner;
public class Reverse_String_Preserve_Order {
	
	public static String Reverse_Str(String str){
		char ch[] = str.toCharArray();
		int l=ch.length;
		char ans[] = new char[l];
		
		for(int i=0;i<l;i++)
		{
			if(ch[i]==' ')		
				ans[i] = ' ';
		}	

		int j = l-1;	
		for(int i=0;i<l;i++)
		{
			if(ch[i] != ' ')
			{
				if(ans[j] == ' ')
					j--;
				
				ans[j]=ch[i];
				j--;
		}
		
	}
		return String.valueOf(ans);	
}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		sc.close();
		
		System.out.println(Reverse_Str(str));
	}

}
