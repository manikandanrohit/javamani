package mani;

import java.util.Scanner;

public class consonant {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	char a=in.next().charAt(0);
	String a1=String.valueOf(a).toLowerCase();
	int b=a1.charAt(0);
	if(b==97||b==101||b==105||b==111||b==117){
	System.out.println("vowels");
}else if((b!=97||b!=101||b!=105||b!=111||b!=117)&&b>=97&&b<=122){
	System.out.println("consonant");
}else{
	System.out.println("invalid");
}
}
}
