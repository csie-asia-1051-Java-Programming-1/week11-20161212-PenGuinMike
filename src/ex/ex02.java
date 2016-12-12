package ex;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
import java.util.*;
import java.util.*;
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字: ");
		String str = scn.nextLine();
		String a[]=(str.split(" "));
		int data[]=new int [a.length];
		for(int i=0;i<a.length;i++){
			data[i]=Integer.valueOf(a[i]);
			System.out.print(data[i]+" ");
		}
		
	}
}