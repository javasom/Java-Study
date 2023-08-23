import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 암호화된 문자열 입력 받기
        System.out.print("암호화된 문자열을 입력하세요: ");
        String encrypted = sc.nextLine();

        // 키 문자열 입력 받기
        System.out.print("키 문자열을 입력하세요: ");
        String key = sc.nextLine();

        // 원본 문자열 복호화하기
        String decrypted = decrypt(encrypted, key);

        // 복호화된 원본 문자열 출력
        System.out.println("복호화된 원본 문자열: " + decrypted);
    }

    // 복호화 함수
    static String decrypt(String encrypted, String key) {
        StringBuilder decrypted = new StringBuilder();

        int keyIndex = 0; // 키 문자열 인덱스
        for (char c : encrypted.toCharArray()) {
            if (c == key.charAt(keyIndex)) { // 키 문자와 일치하면 키 인덱스 증가
                keyIndex++;
                if (keyIndex == key.length()) {
                    keyIndex = 0; // 키 인덱스가 키 문자열 길이와 같아지면 0으로 초기화
                }
            } else { // 키 문자와 일치하지 않으면 원본 문자열에 추가
                decrypted.append(c);
            }
        }

        return decrypted.toString();
    }
}