package study0603_JJE;

import java.util.function.BiPredicate;

public class Exercise2703 {
	public static void main(String[] args) {
		
		BiPredicate<String, Integer> conv = (str, num) -> {
			return str.length() > num? true : false; // ���ڿ� ���̰� ���� �μ����� ũ�� true, ������ false�� ��ȯ�ϴ� if��
		};

		
		if(conv.test("Robot",3)) {
			System.out.println("���ڿ� ���� 3 �ʰ�");
		}else {
			System.out.println("���ڿ� ���� 3����");
		}
		
		if(conv.test("Box",5)) {
			System.out.println("���ڿ� ���� 5 �ʰ�");
		}else {
			System.out.println("���ڿ� ���� 5 ����");
		}	
	}
}
