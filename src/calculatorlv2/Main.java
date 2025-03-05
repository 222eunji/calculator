package calculatorlv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            // 연산을 수행할 값, 기호 받기
            int num1;
            int num2;
            char op;

            while (true) { // 정수, 기호 입력 및 사칙연산 수행

                while (true) { // 첫번째 값 입력 및 검증
                    System.out.print("1. 첫 번째 값을 입력해주세요: ");
                    try {
                        num1 = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.print("　※ 정수를 입력해주세요!\n");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }

                while (true) { // 부호 입력 및 검증
                    System.out.print("2. +, -, *, / 중 1개를 입력해주세요: ");
                    try {
                        op = sc.next().charAt(0);
                        if (op != '+' && op != '-' && op != '*' && op != '/') {
                            throw new Exception();
                        }

                    } catch (Exception e) {
                        System.out.print("　※ 사칙연산 부호를 입력해주세요!\n");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }

                while (true) { // 두번째 값 입력 및 검증
                    System.out.print("3. 두 번째 값을 입력해주세요: ");
                    try {
                        num2 = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.print("　※ 정수를 입력해주세요!\n");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }


            int result = 0; // 연산 결과 값 넣을 변수 선언

            try {
                result = calculator.calculator(num1, num2, op);
                System.out.println("▷ 결과: " + num1 + op + num2 + "=" + result + "\n");
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("　※ 나눗셈 연산에서 분모(두번째 값)에 0이 입력될 수 없습니다.\n 　　값을 다시 입력해주세요.\n");
            }
            } // 사칙 연산 완료


            // 사친 연산 성공 이후
            // 데이터 삭제 여부 확인
            char del;
            while (true) {
                System.out.println("저장된 결과값을 삭제하겠습니까?");

                // 연산 결과 기록 확인
                System.out.println("계산 이력: " + calculator.getResults());

                System.out.println("A.삭제하지 않음 / B.최근 연산 결과 삭제 / C.첫 번째 데이터 삭제 / D.전체 데이터 삭제");
                del = sc.next().charAt(0);
                sc.nextLine();
                calculator.removeResult(del);

                if (del == 'A' || del == 'B' || del == 'C' || del == 'D') {
                    break;
                }
            }

            // 계산 진행 여부 확인
            System.out.print("\n더 계산하시겠습니까? (exit 입력 시 종료)\n입력: ");
            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                System.out.print("계산기를 종료합니다.");
                break;
            } else {
                System.out.print("===================================");
            }
            System.out.println(" ");

        } // 계산기 전체 반복
    }
}
