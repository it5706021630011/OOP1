import java.io.*;
import java.util.Scanner;
public class trik {
public static void main(String args[]){
	String input ;
	int a=1,b=0,c=0,i=0,tmp;
	char t ;
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter :");
	input = scan.nextLine().toUpperCase();
	while(i!=input.length()){
		t=input.charAt(i);
		if(t=='A'){
			tmp=a;
			a=b;
			b=tmp;
		}
		else if (t=='B'){
			tmp=b;
			b=c;
			c=tmp;
		}
		else if (t=='C'){
			tmp=a;
			a=c;
			c=tmp;
		}
		i++;
	}
	if(a==1){
		System.out.println("ball in glass 1");
	}
	else if (b==1){
		System.out.println("ball in glass 2");
	}
	else if (c==1){
		System.out.println("ball in glass 3");
	}
}
}
