package YoonJava;

interface SLenComp1 {
	void print(String s);
}
//�̷��� Ǫ�� ���� �´��� �𸣰���. 
public class YoonJava27_1_2 {
	public static void main(String[] args) {
		SLenComp1 sc;
		sc = (String s) -> {System.out.println(s);};
		sc.print("Robot");
		sc = (String s) -> {System.out.println(s);};
		sc.print("Lamda");
		sc = (String s) -> {System.out.println(s);};
		sc.print("Box");
	}

}

