import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 6;
        System.out.println(x > y && x < y);
        forloop();
        Scanner accept = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = accept.nextInt();
        System.out.println("enter num2");
        int num2 = accept.nextInt();
        System.out.println("enter operator");
        char operator = accept.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
            case '*':
                System.out.println(num1 * num2);
            case '/':
                if (num2 == 0) {
                    System.out.println("undefined");
                } else
                    System.out.println(num1 / num2);
        }
    }

    public static void forloop() {
        int i;
        String[] cal = {"c", "a", "l", "c", "u", "l", "a", "t", "o", "r"};
        for (i = 0; i <= 9; i++) {
        System.out.print(cal[i]);
    }
        System.out.println("");
}

    }




