
public class Student {
	int id;
	static String schoolname ;
	private int secretNum;
	
	boolean ismale;
	String name ;
	
	public Student(String name_, int secretNum_) {
		name = name_;
		secretNum = secretNum_;
		System.out.println("내 이름은 씌빠ㅓ 이겁니다.  -> " + name);
	
	}
	static void addTwoint(int a, int b) {
		System.out.printf("%s", schoolname);
	}
	
	public void down() {
		id--;
	}
	public void up() {
		id++;
	}
	
	public void printID() {
		System.out.println( name  + "의 id는  " + id);
	}
	
	public int getId() {
		return id;
	}
	public void changeSchool(String newSchool)
	{
		schoolname = newSchool;
	}
	
	public void printSchool()
	{
		System.out.println( name  + "의 학교는  " + schoolname);
	}
	
	public void callSecretNum()
	{
		System.out.println( name  + "의 secretNum 는  " + secretNum);
	}
	public void increaseCecret()
	{
		secretNum++;
	}
}
class Data_1{
	
	int value;
	String name;
	
	
	public Data_1() {
		this(10, "None");
	}
	
	public Data_1(String name_) {
		this(10, name_);
		//value = 10;
		//name = name_;
	}
	
	public Data_1(int value_) {
		this(value_, "Nono");
		//value = value_;
		//name = "None";
	}
	
	public Data_1(int value,String name) {
		this.value = value;
		this.name = name;
	}
	
	public void Print_values() {
		System.out.println(value +","+ name);
	}
	
	public void Up(int input_up) {
		value = value + input_up;
	}
	public void Multiply(int input_mul) {
		value = value * input_mul;
	}
	public void Divied(int input_div) {
		
		if(value%input_div==0) {
			System.out.println("나누어 떨어집니다.\n");
			}
		else {
			System.out.printf("나머지는 %d 입니다\n", value%input_div);
		}
		
		
		}
	}


