package week1.jungmin.inflearn._2array._0204;

import java.util.Scanner;

//피보나치 수열 
//week5_day3: 220727
//실패 

public class Main {
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  String input = in.nextLine();
	
	  int num = Integer.parseInt(input);
	  
	  String result = "1 1";
	  
	  for (int i = 3; i < num-1; i++) {
			int num1 = Integer.parseInt(result.substring(2*i-1, 2*i));
			int num2 = Integer.parseInt(result.substring(2*i+1, 2*i+2));
			System.out.println(num2);
			result += " " + num1 + num2;
	  }
	  
	  System.out.println(result);
	}
}