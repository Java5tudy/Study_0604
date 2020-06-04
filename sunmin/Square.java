package Programmers;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("입력할 별의 개수를 적으세요.");
		a = sc.nextInt();
		System.out.println("길이가 얼마인 직사각형을 만들까요?");
		b = sc.nextInt();
		        
			for(int i=1; i<=b; i++) {
				for(int j=1; j<=a; j++)
						System.out.print("*");
		            System.out.println();
		    }

	}
}