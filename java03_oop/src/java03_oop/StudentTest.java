package java03_oop;

public class StudentTest {

	public StudentTest() {
		
	}

	public static void main(String[] args) {
		Student stu = new Student();
		Student stu2 = new Student(3, "제니","010-4567",85,56,58);
			
		System.out.println(stu2.getName());
		
		System.out.println(stu2.toString());
		System.out.println(stu.toString());
	}

}
