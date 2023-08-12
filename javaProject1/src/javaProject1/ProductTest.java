package javaProject1;

public class ProductTest {

	public ProductTest() {
		
	}

	public static void main(String[] args) {
		
		System.out.println("상품번호"+"\t"+"상품명"+"\t"+"가격"+"\t"+"연도"+"\t"+"제조사"+"\t");
		System.out.println("------------------------------------");
		
		ProductVO[] prds = new ProductVO[]{
				new ProductVO(1, "노트북", 1200000, 2021, "삼성"),
	            new ProductVO(2, "모니터", 300000, 2021, "LG"),
	            new ProductVO(3, "마우스", 30000, 2020, "로지텍")
	            
	        };
		for (ProductVO prd : prds) {
			System.out.println(prd.toString());
		}

	}

}
