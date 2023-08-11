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
	            System.out.printf("%03d\t%s\t%d\t%d\t%s\n", prd.getPrdNo(), prd.getPrdName(),
	                    prd.getPrdPrice(), prd.getPrdYear(), prd.getPrdMaker());
	        }
		

//		ProductVO pd1 = new ProductVO(1, "노트북", 1200000, 2021, "삼성");
//	    System.out.printf("%03d\t%s\t%d\t%d\t%s\n", pd1.getPrdNo(), pd1.getPrdName(), pd1.getPrdPrice(), pd1.getPrdYear(), pd1.getPrdMaker());
//
//	    ProductVO pd2 = new ProductVO(2, "모니터", 300000, 2021, "LG");
//	    System.out.printf("%03d\t%s\t%d\t%d\t%s\n", pd2.getPrdNo(), pd2.getPrdName(), pd2.getPrdPrice(), pd2.getPrdYear(), pd2.getPrdMaker());
//
//	    ProductVO pd3 = new ProductVO(3, "마우스", 30000, 2020, "로지텍");
//	    System.out.printf("%03d\t%s\t%d\t%d\t%s\n", pd3.getPrdNo(), pd3.getPrdName(), pd3.getPrdPrice(), pd3.getPrdYear(), pd3.getPrdMaker());
	}

}
