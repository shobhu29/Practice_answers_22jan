import java.util.Scanner;
import java.lang.Math;
public class Power5 {
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
		    int num = sc.nextInt();
		    sc.close();
		    if (isPower(num)) {
		      System.out.println("TRUE");
		    } else {
		      System.out.println("FALSE");
		    }
		 }
}
	private static boolean isPower(int num) {
			if (num % 5 != 0) 
				return false;
			else 
			  	{
					for (int i = 0; i <= num; i++) 
					{
						if (Math.pow(5, i) == num) 
							return true;
					}
			  	}
		    return false;
		  }
	}