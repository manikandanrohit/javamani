package mani;

import java.util.Scanner;

public class balance {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	String a=in.next(),a1=a;
	int b=a.length();
	a=a.replace(String.valueOf(a.charAt(0)),"");
    int b1=a.length();
	a=a.replace(String.valueOf(a.charAt(0)),"");
    int b2=a.length();
    if((b-b1)==(b1-b2)){
    	System.out.println("yes");
    }else{
    	System.out.println("no");
    }
}
}
