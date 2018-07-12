package mani;
import java.util.Scanner;
public class positive {
public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	int a=in.nextInt();
	if(a!=0) {
		if(a>0) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
	}else {
		System.out.println("zero");
	}
}
}
