package calculatorlv2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {

    // 1. 속성
    private List<Integer> results = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성

    // 2. 생성자

    // 3. 기능
    // 덧셈 기능
    int sum(int a, int b) {
        int result = a + b;
        this.results.add(result);

        return result;
    }


    // 뺄셈 기능
    int sub(int a, int b) {
        int result = a - b;
        this.results.add(result);

        return result;
    }


    // 곱셈 기능
    int mul(int a, int b) {
        int result = a * b;
        this.results.add(result);

        return result;
    }


    // 나눗셈 기능
    int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("나눗셈 오류");
        }
        int result = a / b;
        this.results.add(result);

        return result;
    }


    // 사칙연산 기능
    int calculator(int a, int b, char op) {
        int result = 0;

        switch (op) {
            case '+':
                result = sum(a, b);
                break;

            case '-':
                result = sub(a, b);
                break;

            case '*':
                result = mul(a, b);
                break;

            case '/':
                result = div(a, b);
                break;
        }

        return result;
    }


    // Getter
    public List<Integer> getResults() {
        return this.results;
    }


    // 연산 결과 데이터를 삭제하는 기능
    public void removeResult(char del) {
        switch (del) {
            case 'A':
                System.out.println("삭제를 하지 않습니다.");
                break;

            case 'B':
                System.out.println("최근 연산 결과를 삭제합니다. ('" + results.get(results.size() - 1) + "' 삭제)");
                results.remove(results.size() - 1);
                break;

            case 'C':
                System.out.println("첫번째 데이터를 삭제합니다. ('" + results.get(0) + "' 삭제)");
                results.remove(0);
                break;

            case 'D':
                System.out.println("전체 데이터를 삭제합니다.");
                results.clear();
                break;

            default:
                System.out.println("※ 올바른 값을 입력하세요.\n");

        }

    }

}