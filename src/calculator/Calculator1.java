package calculator;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            // 연산을 수행할 값, 기호 받기
            int num1;
            int num2;
            char op;

            while(true){
            System.out.print("첫 번째 값을 입력해주세요: "); // 첫번째 값 입력 및 검증
            try {
                num1 = sc.nextInt();
            } catch (Exception e){
                System.out.print("　※ 정수를 입력해주세요!\n");
                sc.nextLine();
                continue;
            }
            break;
            }

            while (true) {
                System.out.print("+, -, *, / 중 1개를 입력해주세요: "); // 부호 입력 및 검증
            try {
                op = sc.next().charAt(0);
                if (op != '+' && op != '-' && op != '*' && op != '/') {
                    throw new Exception();
                }

            } catch (Exception e){
                System.out.print("　※ 사칙연산 부호를 입력해주세요!\n");
                sc.nextLine();
                continue;
            }
            break;
            }


            while(true){
            System.out.print("두 번째 값을 입력해주세요: "); // 두번째 값 입력 및 검증
            try {
                num2 = sc.nextInt();
            } catch (Exception e){
                System.out.print("　※ 정수를 입력해주세요!\n");
                sc.nextLine();
                continue;
            }
                break;
            }


            // switch를 사용하여 연산 실행하기
            int result = 0; // 연산 결과 값 넣을 변수

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
                        System.out.println("　※ 나눗셈 연산에서 분모(두번째 값)에 0이 입력될 수 없습니다.\n"); // 분모가 0일경우 예외처리
                        continue;
                    } else {
                        result = num1 / num2;
                    }
                    break;
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

    }
}
