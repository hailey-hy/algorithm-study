package week1.jungmin.inflearn._1string._0106;
import java.util.Scanner;

//week2_day2: 220705
//time: 152ms
//Memory: 27mb
//소요시간: 15 

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    String[] arr = input.split("");
    String result = "";

    for (int i = 0; i < arr.length; i++) {
    	if (!result.contains(arr[i])) {
			result += arr[i];
		}
	}
    System.out.println(result);
  }
}