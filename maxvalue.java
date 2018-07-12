package mani;

import java.util.Arrays;
import java.util.Scanner;

public class minvalue {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int b=in.nextInt();
	int a[]=new int[b];
	for(int i=0;i<b;i++){
		a[i]=in.nextInt();
	}Arrays.sort(a);
	System.out.println(a[b-1]);
}
}
