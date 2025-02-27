package calculator;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            // 연산을 수행할 값, 기호 받기
            System.out.print("첫 번째 값을 입력해주세요: ");
            int num1 = sc.nextInt();

            System.out.print("+, -, *, / 중 1개를 입력해주세요: ");
            char op = sc.next().charAt(0);

            System.out.print("두 번째 값을 입력해주세요: ");
            int num2 = sc.nextInt();


            // 입력된 값이 양의 정수인지 검증하기

            // switch를 사용하여 연산 실행하기
            int result = 0; // 연산 값 넣을 볍ㄴ수

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 값)에 0이 입력될 수 없습니다."); // 분모가 0일경우 예외처리
                    } else {
                        result = num1 / num2;
                    }
                    break;

                default:
                    System.out.print("사칙연산 부호가 아닙니다. ");
            }

            sc.nextLine();
            System.out.println("결과: " + num1 + op + num2 + "=" + result);
            System.out.print("\n더 계산하시겠습니까? (exit 입력 시 종료)\n입력: ");
            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                System.out.print("계산기를 종료합니다.");
                break;
            } else {
                System.out.print("===================================");
            }
            System.out.println(" ");
        }



        // 결과 도출

        // 반복문을 상
    }
}
