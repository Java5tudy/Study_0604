package study0603_JJE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2801 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");	
	
		Collections.sort(list, String::compareToIgnoreCase);// �޼ҵ� ���� ��ȣ ���� �ʰ�. 
	
		System.out.println(list);
	}

}
/*�޼ҵ� ���� ����
�޼ҵ� ������ ������ ���ٷ� ��ȯ�ϱ� ���� ����� ������ ������
Convert �޼ҵ带 ȣ���� �� ���ٸ� ���ڷ� �Ѱ��� �� �ִ�.
convert(100, (number) -> String.valueOf(number));

valueOf() �޼ҵ尡 Integer �� �ް� String �� ��ȯ�ϴ� ���ǿ� ��ġ�Ѵ�
���� �޼ҵ� ������ ��ü�� �� ����
convert(100, String::valueOf);
*/