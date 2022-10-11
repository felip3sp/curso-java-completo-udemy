package generics;

import java.util.*;

public class TESTARUMACOISA {
	
	public static int FirstFactorial(int num) {
		
	if(num != 1) {
		return num * FirstFactorial(num - 1);
	}
	return num;
	}
	
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.print(FirstFactorial(s.nextInt()));	
	s.close();
	}
}
