package S0604;

import java.util.function.BiConsumer;

public class S27_4 {
	public static void main(String[] args) {
		BiConsumer<Integer, Double> x = (a,b) -> System.out.println(a + " and " + b);
		
		x.accept(1,2.3);
	}
}

	