package calculatorlv2;
import java.util.ArrayList;

public class Calculator {

    // 1. 속성
    private ArrayList<Integer> results = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성


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
    int mul(int a, int b){
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
          result =  mul(a, b);
          break;

          case '/':
          result =  div(a, b);
          break;
      }

      return result;
      }
    }
