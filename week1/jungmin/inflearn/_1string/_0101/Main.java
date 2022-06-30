package week1.jungmin.inflearn._1string._0101;

import java.util.Scanner;

// day1: 220629
// Time: 171ms
// Memory: 27MB
//소요시간: 8

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