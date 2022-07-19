package week1.jungmin.inflearn._2array._0202;
import java.util.Scanner;

//보이는 학생
//week4_day2: 220719
//time: 547ms
//Memory: 40mb
//소요시간: 15

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    String input1 = in.nextLine();
    
    String input2 = in.nextLine();
    String[] arr = input2.split(" ");
    
    int result = 0;
    
    // 비교대상 앞의 모든 값보다 커야 result +1
    int max = 0;

    for (int i = 0; i < arr.length; i++) {
    	
    	int fir = Integer.parseInt(arr[i]);
    	
    	if (fir > max) {
    		result ++;
    		max = fir;
		}
    	
	}

    System.out.println(result);

  }
}