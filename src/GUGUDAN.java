import java.util.Scanner;

public class GUGUDAN {
	public static void main(String[] args) {
		// 8,9단
		System.out.println("구구단 중 출력할단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " +  number);
		
		if (number < 2 ) {
			System.out.println("제대로 입력해라 짱난다.");
		} else if (number > 9) {
			System.out.println("구구단이나똑바로 배우고 와라");
		} else {
			for(int i = 1; i < 10; i++){
				System.out.println(number * i);
			}
	
		}
		
		
		
		// 6단
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1;//i++
//			
//		}
		
		// 7단
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
			
		// 2단
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		// 3단
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
		// 4단
//		System.out.println("4단");
//		int result = 4 *1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);

//		System.out.println("구구단 중 출력할단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		
	}
}
