import java.util.Scanner;
public class Menu {
	
	public static int add(int a,int b){
		return a+b;
	}
	public static int subtract(int a,int b){
		return a-b;
	}
	public static int multiply(int a,int b){
		return a*b;
	}
	public static double divide(int a,int b){
		return (double)a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		while(true){
			System.out.println("Type 1 for add");
			System.out.println("Type 2 for subtract");
			System.out.println("Type 3 for multiply");
			System.out.println("Type 4 for divide");
			System.out.println("Type 5 for exit");
			System.out.println("Enter your choice");
			int n1,n2,ch;
			ch= sc.nextInt();
			switch(ch){
			case 1:n1=sc.nextInt();
				   n2=sc.nextInt();
				   System.out.println(add(n1,n2));
				   break;
			case 2:n1=sc.nextInt();
			       n2=sc.nextInt();
			       System.out.println(subtract(n1,n2));
			       break;
			case 3:n1=sc.nextInt();
		           n2=sc.nextInt();
		           System.out.println(multiply(n1,n2));
		           break;
			case 4:n1=sc.nextInt();
		           n2=sc.nextInt();
		           System.out.println(divide(n1,n2));
		           break;
			case 5:System.out.println("Program Successfully Terminated");
				   System.exit(0);
				   break;
		    default:System.out.println("Wrong Choice");
			}
		}
	}
}