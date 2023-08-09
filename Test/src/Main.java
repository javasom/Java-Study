

public class Main {
	public static void main(String[] args) {
		Student Kim = new Student("Kim", 123);
		
		Kim.printID();
		Kim.down();
		Kim.printID();
		
		Data_1 D = new Data_1(20,"Kwon");
		Data_1 D2 = new Data_1();
		
		D.Print_values();
		D.Up(5);
		D.Print_values();
		D.Multiply(10);
		D.Print_values();
		D.Divied(5);
		D.Divied(3);
		
		
		
	}
	
	
	
}
