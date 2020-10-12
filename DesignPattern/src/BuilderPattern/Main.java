package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		Product product=new Product.Builder().builder();
		System.out.println(product.toString());

	}

}
