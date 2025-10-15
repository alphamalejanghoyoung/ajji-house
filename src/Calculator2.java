import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 입력 값 : ");
        int first = scanner.nextInt();
        System.out.println(first);

        System.out.println("원하는 기호를 입력하세요 : ");
        String symbol = scanner.next();

        System.out.println("두 번째 입력 값 : ");
        int second = scanner.nextInt();
        System.out.println(second);

        if ("+".equals(symbol)) {
            System.out.println("두 값의 덧셈 : " + (first + second));
        } else if ("-".equals(symbol)) {
            System.out.println("두 값의 뺄셈 : " + (first - second));
        } else if ("*".equals(symbol)) {
            System.out.println("두 값의 곱셈 : " + (first * second));
        } else if ("/".equals(symbol)) {
            System.out.println("두 값의 나눗셈 : " + (first / second));
        } else {
            System.out.println("사칙연산에 맞지 않는 값을 입력했습니다.");
        }
    }
}