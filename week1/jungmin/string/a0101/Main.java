package week1.jungmin.string.a0101;

import java.util.Scanner;

// day1: 220629

public class Main {
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String input1 = sc.nextLine();
	  String input2 = sc.nextLine();
	  
	  int cnt = 0;
	  for (int i = 0; i < input1.length(); i++) {
		if (input2.equalsIgnoreCase(input1.substring(i, i+1))) {
			cnt += 1;
		}
	  }
	  System.out.println(cnt);
  }
}