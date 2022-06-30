package week1.jungmin.inflearn._1string._0104;
import java.util.Scanner;
  

//day2: 220630
//time: 165ms
//Memory: 27mb
//소요시간: 15
public class Main {
  public static void main(String[] args){
	  
    Scanner in = new Scanner(System.in);
    int input1 = Integer.parseInt(in.nextLine()); // nextLine 주의 
    
    String result = "";
    
    for (int i = 0; i < input1; i++) {
		String inputStr = in.nextLine();
		String resultStr = "";
		for (int j = 0; j < inputStr.length(); j++) {
			resultStr += inputStr.substring(inputStr.length()-j-1, inputStr.length()-j);
		}
		result += resultStr + "\n";
	}
    System.out.println(result);
  }
}