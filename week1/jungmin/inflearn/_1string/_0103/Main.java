package week1.jungmin.inflearn._1string._0103;

import java.util.Scanner;

//day2: 220630
//time: 165ms
//Memory: 27mb
//소요시간: 10

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] words = input.split(" ");

		String longest = "";
		
		for (int i = 0; i < words.length; i++) {
			if (longest.length() < words[i].length()) {
				longest = words[i];
			}
		}
		System.out.println(longest);
	}

}
