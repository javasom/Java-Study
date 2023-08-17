package test08_structure;

import java.util.Scanner;

import test08_structure.IntStack.EmptyIntStackExeoption;
import test08_structure.IntStack.OverflowIntStackException;

public class IntStackTest {

	public IntStackTest() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(5); // new IntStack(10);
		
		while(true) {
			System.out.println("데이터의 수 : "+s.size()+", 스택의 크기 : "+ s.capacity());
			System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)EMPTY (7)스택 정보 표시 (8)REMOVE (0)종료->");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 0: 
				System.exit(0);//프로그램 종료
				break;
			case 1://push
				System.out.print("데이터 값: ");
				int data = sc.nextInt();
				try {
					s.push(data);
				}catch(OverflowIntStackException oise) {
					System.out.println(oise.getMessage());
				}
				break;
			case 2://pop
				try {
					int popData = s.pop();
					System.out.println("스택의 제일 위에 있는 값 : "+ popData);
				}catch(EmptyIntStackExeoption eise) {
					System.out.println(eise.getMessage());
				}
				break;
			case 3://peek
				try {
					int topData = s.peek();
					System.out.println("top->"+ topData);
				}catch(EmptyIntStackExeoption ese) {
					System.out.println(ese.getMessage());
				}
				break;
			case 4://dump -> 스택의 모든 값을 [12,65,87]	[]
				String dumpData = s.dump();
				System.out.println("스택의 모든 데이터 : "+ dumpData);
			case 5://Search -> 데이터가 있는 index값을 구해준다. 없으면 -1이 돌아온다.
				System.out.println("찾을 값 입력 : ");
				int searchData = sc.nextInt();
				int idx = s.indexOf(searchData);
				System.out.println(searchData+"은(는) "+idx+"위치에 있습니다.");
				break;
			case 6://Empty -> 스택의 모든 데이터 지우기
				s.clear();
				System.out.println("남은 데이터 수 : "+ s.size());
				break;
			case 7: //스택 정보 표시
				int size = s.capacity();
				int dataCnt = s.size();
				boolean empty = s.isEmpty(); //true: 비어있다, false: 비어있지 않다.
				boolean full = s.isFull();//true: 가득 찼다, false: 가득 차지 않았다.
				
				System.out.println("스택 크기 : "+ size);
				System.out.println("데이터 수 : "+ dataCnt);
				System.out.println("비어"+((empty)?"있습니다." : "있지 않습니다." ));
				System.out.println("가득 "+((full)?"차 있습니다." : "차지 않았습니다."));
				break;
			case 8: //삭제(값)
				System.out.println("삭제할 데이터 : ");
				int delData = sc.nextInt();
				
				boolean result = s.remove(delData);
				System.out.println(delData+"은(는) 삭제"+((result)?"되었습니다.":"하지 못하였습니다."));
				break;
			default:
				System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}
	}
}
