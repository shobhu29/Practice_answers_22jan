import java.util.Scanner;
public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		sc.close();
		int sum=0;
		for(char ch: s.toCharArray())
		{
			if(ch >= 'a' && ch <= 'z')
			{
				sum=sum + 1 + ch - 'a';
				
			}
			
		}
		System.out.println(sum);
	}

}
