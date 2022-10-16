import java.util.Scanner;
class inputdata
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your 1st number");
		int num1 =sc.nextInt();
		System.out.println("enter your 2nd number:");
		int num2 =sc.nextInt();
		System.out.println("enter your 3rd number:");
		int num3 =sc.nextInt();
		int sum = num1+num2+num3;
		int avg = sum/3;
		System.out.println("YOUR AVERAGE OF 3 NUMBER IS : "+avg);
	}
}
		