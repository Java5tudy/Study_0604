package YoonJava;

interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) {
		con=s;
	}
	public Printable getPrinter( ) {
		return new Printable() {
			public void print() {
				System.out.println(con);
			}
		};
	}
}
public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers p = new Papers("서류내용: 행복합니다.");
		Printable prn = p.getPrinter();
		prn.print();

	}

}
