
public class Product {
	//멤버변수
	protected String productName = "컴퓨터";
	protected int price = 120;
	//생성자
	protected Product() {
		
	}
	//메소드
	protected void output() {
		System.out.println(productName+"->"+price);
	}
}
