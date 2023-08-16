package test01_basic;

public class ForEx {

	public static void main(String[] args) {
		
        int maxNum = 50;  // 소수를 구할 범위의 최댓값

        // 2부터 maxNum까지의 숫자에 대해 소수 판별
        for (int i=2; i <= maxNum; i++) {//2,3,4,5,6....50
        	int j;
            for (j=2; j<i; j++) {// i=3, j=2, i=4, j=2,3
                if (i%j == 0) {
                    break;// 나누어지면 소수가 아님
                }
               
            }// 소수인 경우 출력
            //i=4, j=2
            //i=5, j=5
            if(i==j)
            	System.out.print(i+" ");
            }
        }
    }

/*
 [문제] 다중for문을 이용해서 소수를 구하시오.
 1-50사이의 소수 (1과 자기자신 이외의 약수를 갖지 않는 수)
 
 [출력]
 2 3 5 7 11 .....47
 */
