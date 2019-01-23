import java.util.Scanner;
public class String_manipulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c[]= new int[26];
		int x;
		for(int i=0;i<str.length();i++){
			x=(str.charAt(i)-'a');
			c[x]++;
		}
		for(int i=0;i<26;i++) {
			if(c[i]>0) {
				char temp = (char)(97+i);
				System.out.print(temp+"="+c[i]+",");
			}
		}
			
	}

}