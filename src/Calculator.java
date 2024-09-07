import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();

        Operation operation;

        switch (operator) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                    return;
                }
                operation = new Div();
                break;
            default:
                System.out.println("연산자(+, -, *, /)를 입력하세요.");
                return;
        }

        operation.setValue(a, b);
        System.out.println("결과: " + operation.calculate());
    }
}
abstract class Operation {
    protected int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int calculate();
}

class Add extends Operation {
    @Override
    int calculate() {
        return a + b;
    }
}

class Sub extends Operation {
    @Override
    int calculate() {
        return a - b;
    }
}

class Mul extends Operation {
    @Override
    int calculate() {
        return a * b;
    }
}

class Div extends Operation {
    @Override
    int calculate() {
        return a / b;
    }
}
