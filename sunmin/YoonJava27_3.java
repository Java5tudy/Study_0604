package YoonJava;
import java.util.function.BiPredicate;



public class YoonJava27_3 {

	public static void main(String[] args) {
		BiPredicate<String, Integer> conv= (str, num) -> str.equals(Integer.toString(num));
		//testȣ�� ��� ���ڿ� "Robot"�� ���̰� 3�� ������ true��ȯ	 // ���� �޼��带 ��� ���� �𸣰ڴ�.
		//���̸� ���ؾ� �ϴµ�//
				if(conv.test("Robot",3))
					System.out.println("���ڿ� ���� 3 �ʰ�");
				else
					System.out.println("���ڿ� ���� 3 ����");
		//testȣ�� ��� ���ڿ� "Box"�� ���̰� 5�� ������ true��ȯ
		if(conv.test("Box",5))
			System.out.println("���ڿ� ���� 5 �ʰ�");
		else
			System.out.println("���ڿ� ���� 5 ����");
	}

}
