package YoonJava;
import java.util.function.BiFunction;

class Box<T, U> {
	private T id;
	private U con;
	public Box(T i, U c) {
		id =i;
		con=c;
	}
	public void showIt() {
		System.out.println("ID: "+id + ","+ "Contents:" +con);
	}
}
public class YoonJava28_2 {
	public static void main(String[] args) {
		//fil the blanks
		
		Box<Integer, String> b1 = bf.apply(1, "Toy");  //1�� Toy�� ����� ���� ��ȯ
		Box<Integer, String> b2 = bf.apply(2, "Robot"); //2�� Robot�� ����� ���� ��ȯ
		b1.showIt();
		b2.showIt();

	}

} //BiFunction<T, U, R> 
