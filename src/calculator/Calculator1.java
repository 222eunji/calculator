package calculator;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 연산을 수행할 값, 기호 받기
        System.out.print("첫 번째 값을 입력해주세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 값을 입력해주세요: ");
        int num2 = sc.nextInt();
        System.out.print("+, -, *, / 중 1개를 입력해주세요: ");
        char op = sc.next().charAt(0);


        // 입력된 값이 양의 정수인지 검증하기

        // switch를 사용하여 연산 실행하기
        int result=0; // 연산 값 넣을 볍ㄴ수

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
                result = num1 / num2;
                break;
        }

        System.out.println("계산결과: " + result );



        // 나눗셈일 경우 num2가 0이 아닌지 확인하기

        // 결과 도출

        // 반복문을 상
    }
}
