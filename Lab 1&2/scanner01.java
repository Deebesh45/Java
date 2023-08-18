import java.util.Scanner;

class scanner01{
	public static void main(String args[]){
		int a,b,c;
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter -a- value:");
		a=s1.nextInt();
		System.out.println("Enter b value:");
		b=s1.nextInt();
		c=a+b;
		System.out.println("Sum is: "+c);
		s1.close();
	}
}

