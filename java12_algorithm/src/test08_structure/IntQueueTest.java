package test08_structure;

import java.util.Scanner;

import test08_structure.IntQueue.QueueEmptyException;
import test08_structure.IntQueue.QueueOverflowException;

public class IntQueueTest {
	Scanner sc = new Scanner(System.in);
	public IntQueueTest() {
	}
	public void queueStart() {
		
		IntQueue que = new IntQueue(5);
		
		while(true) {
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)데이터 보기 (6)indexOf (7)remove (0)종료?");
			int m = sc.nextInt();
		
			switch(m) {
			case 0: 
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			case 1: // enqueue : 큐에 데이터 추가
				//추가할 값 입력
				System.out.print("추가할 데이터 입력= ");
				int data = sc.nextInt();
				try {
					int r = que.enqueue(data);
				}catch(QueueOverflowException qoe) {
					System.out.println(qoe.getMessage());
				}
				break;
			case 2: //dequeue : 큐의 데이터를 얻어오기
				try {
					int queueData = que.dequeue();//큐의 제일 앞 데이터 가져오기
					System.out.println("제일 처음 값= "+ queueData);
				}catch(QueueEmptyException qee) {
					System.out.println(qee.getMessage());
				}
				break;
			case 3: //peek : 큐의 제일 앞 데이터 알아내기
				try {
					int queueData = que.peek();
					System.out.println("제일 처음 값은 "+queueData+"입니다.");
				}catch(QueueOverflowException qee) {
					System.out.println(qee.getMessage());
				}
				break;
			case 4: //dump : 큐의 정보 알아내기
				//큐의 용량
				System.out.println("큐의 최대 크기= "+ que.capacity());
				//큐의 데이터 수
				System.out.println("큐의 데이터 수= "+ que.size());
				//큐가 비어있는지
				System.out.println("Empty= "+ que.isEmpty());
				//큐가 가득 찼는지
				System.out.println("Full= "+ que.isFull());
				//큐의 처음 데이터
				System.out.println("큐의 처음 값= "+ que.peek());
				//큐의 마지막 데이터
				System.out.println("큐의 마지막 값= "+ que.peekLsat());
				break;
			case 5: //데이터 보기 front->rear까지의 값을 순서대로 접근
				String result = que.getAllData();
				System.out.println("전체 데이터= " +result);
				break;
			case 6: // indexOf : 데이터의 index구하기
				System.out.println("찾을 값 입력= ");
				int seachData = sc.nextInt();
				
				int r = que.indexOf(seachData);
				System.out.println(seachData+"의 index는 " + r+"입니다.");
				break;
			case 7: //remove : 큐에서 데이터 지우기
				System.out.print("삭제할 값 입력= ");
				int delDate = sc.nextInt();
				
				int delResult = que.remove(delDate);
				System.out.println();
				if(delResult == -1) {
					System.out.println("값이 존재하지 않습니다.");
				}else {
					System.out.println(delDate+ "를 삭제하였습니다.");
				}
				break;
			default : System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}		
	}
	public static void main(String[] args) {
		new IntQueueTest().queueStart();

	}
}
