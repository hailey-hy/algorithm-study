package week1.jungmin.inflearn._2array._0203;

import java.util.Scanner;

//가위 바위 보
//week5_day2: 220726
//time: 157ms
//Memory: 27mb
//소요시간: 30


//바위(2) > 가위(1), 보(3) > 바위(2)
//가위(1) < 바위(2), 바위(2) < 보(3)
//특이: 가위(1) > 보(3), 보(3) < 가위(1)
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    String input1 = in.nextLine();
    String input2 = in.nextLine();
    String input3 = in.nextLine();

    int num = Integer.parseInt(input1);
    
    String[] arr1 = input2.split(" ");
    String[] arr2 = input3.split(" ");
    
    StringBuffer result = new StringBuffer();
    
    for (int i = 0; i < num; i++) {
		int num1 = Integer.parseInt(arr1[i]);
		int num2 = Integer.parseInt(arr2[i]);

		if (num1 == num2) {
			result.append("D\n");
		}
		else if((num1 == 1 && num2==3) || (num1 == 3 && num2==1)) {
			if (num1 > num2) {
				result.append("B\n");				
			}
			else {
				result.append("A\n");								
			}
		}
		else {
			if (num1 > num2) {
				result.append("A\n");				
			}
			else {
				result.append("B\n");								
			}			
		}
	}
    
    System.out.println(result);
  }
}