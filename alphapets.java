package mani;

import java.util.Scanner;

public class alphapets {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.next().charAt(0);
	if(a>=65&&a<=90 ||a>=97&&a<=122){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}
