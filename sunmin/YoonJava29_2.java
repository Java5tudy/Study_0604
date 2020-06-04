package YoonJava;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ToyPriceInfo {
	private String model;
	private int price;
	
	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}
	public int getPrice() {
		return price;
	}
	public String getModel() { return model;}
}
public class YoonJava29_2 {
	    public static void main(String[] args) {
	    	List<ToyPriceInfo> ls = new ArrayList<>();
	    	ls.add(new ToyPriceInfo("GUN_LR_45", 200));
	    	ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
	    	ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER", 550));
	    	
	    	int sum = ls.stream()
	    			.filter(p->p.getPrice() <500)
	    			.mapToInt(t->t.getPrice())
	    			.sum();
	    	System.out.println("sum = "+sum);	        
	    	//å�� ���� �켱 Ǯ���µ� �̰� �´��� �𸣰ڴ�. �켱�� ���ư���.  CAR_TRANSFORM_VER	�� ���´�. 
	    	List<String> str = Arrays.asList("GUN_LR_45","GUN_LR_45","CAR_TRANSFORM_VER");
	    	str.stream()
	    		.filter(m->m.length() >=10)
	    		.forEach(m->System.out.print(m+"\t"));
	    	System.out.println();

	    }
	}