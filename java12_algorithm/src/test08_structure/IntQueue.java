package test08_structure;

public class IntQueue {
	//데이터를 담을 배열
	private int queue[];
	
	private int front;//앞쪽(디큐)위치
	private int rear;//뒤쪽(인큐)위치
	
	private int max;//큐의 크기 : 용량
	private int count;//데이터 수
	
	public IntQueue() {
		this(10);
	}	
	public IntQueue(int capacity) {
		max = capacity;
		front = rear = count = 0;
		
		try {
			//큐 생성(배열)
			queue = new int[capacity];
		}catch(OutOfMemoryError oome) {
			System.out.println("메모리가 부족합니다.");
		}
	}
	//인큐 : 큐의 마지막에 데이터 추가
	public int enqueue(int data) {
		//큐가 가득 찼을 때
		if(max == count) {
			throw new QueueOverflowException();
		}
	
		//큐가 여유가 있을 때
		//현재 rear의 위치에 값을 추가하고 rear는 1 증가시킨다.
		queue[rear++] = data;
		//데이터의 수 증가
		count++;
		
		// rear가 배열의 끝까지 이동했을 때 0으로 index를 변경
		if(max==rear) rear = 0;
		
		return data;		
	}
	//디큐 : 큐의 제일 앞 데이터 반환하기
	public int dequeue() {
		// 큐가 비어있는지 확인
		if(count==0) {
			throw new QueueEmptyException();
		}
		
		//front 위치에 값을 돌려주고, front는 1 증가
		int frontData = queue[front++];
		//데이터 수를 감소
		count--;
		
		if(max==front) {// front와 용량과 같으면 처음 index로 변경하기
			front=0;
		}
		return frontData;
	}
	//큐의 처음값 반환하기
	public int peek() {
		if(count==0) {
			throw new QueueOverflowException();
		}
		return queue[front];
	}
	//큐의 용량
	public int capacity() {
		return max;
	}
	//큐의 데이터 수
	public int size() {
		return count;
	}
	//큐가 비어있는지
	public boolean isEmpty() {
		if(count==0) return true;
		else return false;
	}
	//큐가 가득 찼는지
	public boolean isFull() {
		if(max==count) return true;
		else return false;
	}
	//큐의 마지막 데이터	
	public int peekLsat() {
		// 큐의 마지막 값 리턴
		// rear = 비어있는 칸의 index
		// rear = 1,2,3,4	-1 -> 0,1,2,3 
		// rear = 0			-1 -> -1 -> index의 제일 큰 값으로 변경
		
		if(isEmpty()) return -1;
		
		int index = rear-1;
		if(index==-1) index = max-1; //4
		
		return queue[index];
	}
	//큐의 모든 데이터를 순서대로 문자열로 만들어 리턴 [25, 56, 3]		[]
	public String getAllData() {
		String data = "[";
		// fount	real-1
		// 0,1,2,3	  4-1
		// 3,4,0,1	  2-1
		if(count>0) { //데이터가 있을 때
			int temp = rear;
			if(rear==0) { // rear=0이면 제일 큰 index
				temp = max-1;
			}else {
				temp = rear-1; // 이전 index
			}
			for(int i=front; ; i++) {
				if(i==max) i=0; //index가 max과 같으면 0으로 변환
				data += queue[i];
				if(temp !=i) data +=", "; // ,
				if(temp ==i)break; //마지막 값이면
			}
		}	
		data+="]";
		return data;
	}
	public int indexOf(int data) {
		
		if(count>0) {//데이터가 있을 때
			for(int i=front; ; i++) {
				if(i==max) i=0;
				if(queue[i]==data) return i;
					
				if(rear-1==i) break;
			}
			//return -1;
		//}else {//데이터가 없을 때
			//return -1;
		}
		return -1;
	}
	//큐에서 값 지우기
	public int remove(int data) {
		if(!isEmpty()) {//큐가 비어 있는지 확인 
			//삭제할 값이 있는 곳을 찾아야 한다.
			int idx= indexOf(data);
			if(idx>=0) {//데이터가 있을 때
				//총 데이터 수 - ( 값이 있는 index- front )
				int cnt = size() - Math.abs(idx - front);
				
				//		   3	  idx+4
				for(int i=idx ; i<idx+cnt; i++) {// 3,4,5,6
					//			(i+max)%max		(i+1+max)%max
					// 3		 3				4
					// 4		 4				0
					// 5		 0				1
					// 6		 1				2
					queue[(i+max)%max] = queue[(i+1+max)%max];
				}
				// rear를 변경시킨다.
				if(rear==0) {
					rear=max-1;
				}else {
					rear--;
				}
				count--;// 갯수 줄이기
				return data;
			}
		}
		return -1;//큐가 비어 있을 때, 삭제할 데이터가 없을 때
	}
	////////////////////////////////////////////////
	public class QueueOverflowException extends RuntimeException{
		public QueueOverflowException() {
			super("큐가 가득 찼습니다.\n큐의 크기는 "+max+"입니다.\n현재 데이터의 수는 "+count+"개입니다.");
		}
	}
	public class QueueEmptyException extends RuntimeException{
		public QueueEmptyException() {
			super("큐가 비어있습니다.");
		}
	}
}
