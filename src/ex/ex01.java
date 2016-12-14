package ex;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dataSize =scn.nextInt();
		if(dataSize>10||dataSize<1){
			System.out.println("erro");
		}
		int data1 []=new int [3];
		
		for(int i=0;i<3;i++){
			data1[i]=scn.nextInt();
		}
		int data2 []=new int [data1[2]];
		
		for(int i=0;i<data1[2];i++){
			data2[i]=scn.nextInt();
		}
		for(int i=0;i<data2.length-1;i++){
			for(int j=0;j<data2.length-1;j++){
				if(data2[j+1]>data2[j]){
					int change=data2[j+1];
					data2[j+1]=data2[j];
					data2[j]=change;
				}
			}
		}
		int sum=0;
		for(int i=0;i<data1[2];i++){
			sum+=data2[i];
		}if (sum<data1[1]){
			System.out.println(sum);
		}else{
			System.out.println("impossible");
		}
	}
public static void fun1(){
	
		}
}