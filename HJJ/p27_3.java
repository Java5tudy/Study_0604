import java.util.function.BiPredicate;

public class p27_3 {

	public static void main(String[] args) {
		BiPredicate<String, Integer> conv = //�ϼ�������������
		
		//test ȣ�� ��� ���ڿ� "Robot"�� ���̰� 3�� ������ true ��ȯ
		if(conv.test("Robot",3))
			System.out.println(("���ڿ� ���� 3 �ʰ�"));
		else
			System.out.println("���ڿ� ���� 3 ����");
		
		//test ȣ�� ��� ���ڿ� "Box"�� ���̰� 5�� ������ true ��ȯ
		if(conv.test("Box",5))
			System.out.println("���ڿ� ���� 5 �ʰ�");
		else
			System.out.println("���ڿ� ���� 5 ����");
	}

}