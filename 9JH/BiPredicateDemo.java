package LambdaEx1;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[]args) {
		BiPredicate<String, Integer> conv = (x, y) -> {
            return x.length() == y;
        };
		
		if (conv.test("Robot",3))
			System.out.println("문자열 길이 3초과");
		else
			System.out.println("문자열 길이 3이하");
		
		if(conv.test("Box",5))
			System.out.println("문자열 길이 5초과");
		else
			System.out.println("문자열 길이 5이하");
	}
}

/***
 * 		BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
    }
*/
