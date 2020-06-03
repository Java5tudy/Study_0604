package YoonJava;

interface Printable5 {
	void print(String s);
}
public class OneParamNoReturn {
	public static void main(String[] args) {
		Printable5 p;
		p = (String s) -> {System.out.println(s);};
		p.print("Lambda exp one.");
		
		p = (String s) -> {System.out.println(s);};
		p.print("Lambda exp two.");
		
		p = (String s) -> {System.out.println(s);};
		p.print("Lambda exp three.");
		
		p = (String s) -> {System.out.println(s);};
		p.print("Lambda exp four.");
	}

}
