package hw;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
import java.util.*;
public class hw02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int keep [ ] = new int [1];
		int x =0;
		while(x<5){
			String str =scn.nextLine();
			String a[]=(str.split(" "));
			int data[]=new int [a.length];
			for(int i=0;i<a.length;i++){
				data[i]=Integer.valueOf(a[i]);
			}
			int sun1=0;
			for(int i=0;i<data.length;i++){
				keep[i]=data[i];
				int sun=0;
				for(int j=0;j<data.length;j++){
					if(keep[i]==data[j]){
						sun++;
					}
				}
				if(sun>=data.length/2){
					sun1=sun;
				}else {
					sun1=-1;
				}
			}
			if(sun1==-1){
				System.out.println("No");
			}else{
				System.out.println(sun1);
			}x++;
		}
	}
}