package week1.jungmin.inflearn._1string._0111;

import java.util.Scanner;

// 문자열 압축
//week3_day4: 220714
// 실패 (마지막 끝 문자 처리) 

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.nextLine();
    
    // 결과 
    StringBuffer result = new StringBuffer();
    
    int len = input.length();
    
    for (int i = 0; i < len; i++) {
    	int cnt = 0;
    	String c = input.substring(0, 1);

    	if (input.length() > 1) {
    		while(c.equals(input.substring(0, 1))) {
    			c = input.substring(0, 1);
    			input = input.substring(1);
    			
    			cnt += 1;
    			
    			if (input.length()==1) {
					break;
				}
    		}
		}

    	result.append(c);
    	
    	if (cnt > 1) {
    		result.append(cnt);
		}
	}
    System.out.println(result);
  }
}