package ex;
import java.text.DecimalFormat;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
import java.util.*;
import java.util.*;
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=0;
		float data0[][]=new float[5][2]; 
		while(x<5){
			String str = scn.nextLine();
			String a[]=(str.split(" "));
			float sun=0;
			float data[]=new float [a.length];
			for(int i=0;i<a.length;i++){
				data[i]=Integer.valueOf(a[i]);
				sun+=data[i];
			}
			for(int i=0;i<x+1;i++){
				data0[x][0]=data.length;
				data0[x][1]=(sun/data.length);
			}
			x++;
		}
		for(int i=0;i<5;i++){
			System.out.println("Size: "+data0[i][0]);
			System.out.println("Avg: "+data0[i][1]);
		}
	}
}