package mani;

import java.util.Scanner;

public class leapyearornot {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a%2==0){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
}
}
