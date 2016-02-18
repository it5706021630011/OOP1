import java.util.Scanner;
public class Seven_Dwarves {
	public static void main(String[] args){
		int num1,num2,num3,num4,num5,num6,num7,num8,num9=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1 :");
		num1 = scan.nextInt();
		System.out.print("Enter number2 :");
		num2 = scan.nextInt();
		System.out.print("Enter number3 :");
		num3 = scan.nextInt();
		System.out.print("Enter number4 :");
		num4 = scan.nextInt();
		System.out.print("Enter number5 :");
		num5 = scan.nextInt();
		System.out.print("Enter number6 :");
		num6 = scan.nextInt();
		System.out.print("Enter number7 :");
		num7 = scan.nextInt();
		System.out.print("Enter number8 :");
		num8 = scan.nextInt();
		System.out.print("Enter number9 :");
		num9 = scan.nextInt();
		add(num1, num2, num3, num4, num5, num6, num7, num8, num9);
	}
	public static void add(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9){
		
		if(num3+num4+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num3+','+num4+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num2+num4+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num2+','+num4+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num2+num3+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num2+','+num3+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num2+num3+num4+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num6+','+num7+','+num8+','+num9);
		
		else if (num2+num3+num4+num5+num7+num8+num9 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num5+','+num7+','+num8+','+num9);
		
		else if (num2+num3+num4+num5+num6+num8+num9 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num5+','+num6+','+num8+','+num9);
		
		else if (num2+num3+num4+num5+num6+num7+num9 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num5+','+num6+','+num7+','+num9);
		
		else if (num2+num3+num4+num5+num6+num7+num8 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num5+','+num6+','+num7+','+num8);
		
		else if (num1+num4+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num4+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num1+num3+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num3+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num1+num3+num4+num5+num6+num7+num8 == 100)
			System.out.print("midget :" + num1+','+num3+','+num4+','+num5+','+num6+','+num7+','+num8);
		
		else if (num1+num3+num4+num5+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num3+','+num4+','+num5+','+num7+','+num8+','+num9);
		
		else if (num1+num3+num4+num5+num6+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num3+','+num4+','+num5+','+num6+','+num8+','+num9);
		
		else if (num1+num3+num4+num5+num6+num7+num9 == 100)
			System.out.print("midget :" + num1+','+num3+','+num4+','+num5+','+num6+','+num7+','+num9);
		
		else if (num1+num2+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num4+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num4+','+num6+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num4+num5+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num4+','+num5+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num4+num5+num6+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num4+','+num5+','+num6+','+num8+','+num9);
		
		else if (num1+num2+num4+num5+num6+num7+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num4+','+num5+','+num6+','+num7+','+num9);
		
		else if (num1+num2+num4+num5+num6+num7+num8 == 100)
			System.out.print("midget :" + num1+','+num2+','+num4+','+num5+','+num6+','+num7+','+num8);
		
		else if (num1+num2+num5+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num5+','+num6+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num3+num6+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num6+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num3+num5+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num5+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num3+num5+num6+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num5+','+num6+','+num8+','+num9);
		
		else if (num1+num2+num3+num5+num6+num7+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num5+','+num6+','+num7+','+num9);
		
		else if (num1+num2+num3+num5+num6+num7+num8 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num5+','+num6+','+num7+','+num8);
		
		else if (num1+num2+num3+num4+num7+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num3+num4+num6+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num6+','+num8+','+num9);
		
		else if (num1+num2+num3+num4+num6+num7+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num6+','+num7+','+num9);
		
		else if (num1+num2+num3+num4+num6+num7+num8 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num6+','+num7+','+num8);
		
		else if (num1+num2+num3+num4+num5+num8+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num5+','+num8+','+num9);
		
		else if (num1+num2+num3+num4+num5+num7+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num5+','+num7+','+num9);
		
		else if (num1+num2+num3+num4+num5+num7+num8 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num5+','+num7+','+num8);
		
		else if (num1+num2+num3+num4+num5+num6+num9 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num5+','+num6+','+num9);
		
		else if (num1+num2+num3+num4+num5+num6+num8 == 100)
			System.out.print("midget :" + num1+','+num2+','+num3+','+num4+','+num5+','+num6+','+num8);
		
		else if (num1+num2+num3+num4+num5+num6+num7 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num5+','+num7+','+num8+','+num9);
		
		else if (num1+num2+num3+num4+num5+num6+num7 == 100)
			System.out.print("midget :" + num2+','+num3+','+num4+','+num5+','+num7+','+num8+','+num9);
	}
}
