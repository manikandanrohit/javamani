
package mani;

import java.util.Scanner;

public class leapyearornot {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a%4==0){
		if(a%100==0){
			if(a%400==0){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}else{
			System.out.println("yes");
		}
	}else{
		System.out.println("no");
	}
}
}
