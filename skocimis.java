import java.util.Scanner;
public class Skocimis {
	public static void main(String[] args) {
		int n1, n2, n3,i=0;
		Scanner scan = new Scanner(System.in);
		while(i<3) {
			System.out.print("Enter 3 integer (0 < Number1 < Number2 < Number3 < 100): ");
			n1 = scan.nextInt();i++;
			n2 = scan.nextInt();i++;
			n3 = scan.nextInt();i++;
			Add(n1, n2, n3,i);
		}
	}
	public static void Add(int n1, int n2, int n3,int i){
		while (n1 <= 0 || n1 >= 100 || n2 <= 0 || n2 >= 100 || n3 <= 0 || n3 >= 100 || n3 < n1 || n3 < n2 || n2 < n1
				|| n1 > n2 || n1 > n3);{
			if(i<3){
			if (n1 <= 0 || n1 >= 100) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n2 <= 0 || n2 >= 100) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n3 <= 0 || n3 >= 100) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n2 <= n1) {
				System.out.println("Number2 must more than Number1. Please enter again!!!");
			} else if (n3 <= n2) {
				System.out.println("Number3 must more than Number2. Please enter again!!!");
			}
			}
		
		}
		System.out.println("------- Output -------- ");
		System.out.println(" Most played : " + ((n3 - n2) - 1) + " time.");
	}
}
