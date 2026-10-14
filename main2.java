import java.util.*;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: \n");
        int num1 = sc.nextInt();
        System.out.println("Enter secando numbre: \n");
        int num2 = sc.nextInt();
        
        System.out.println("Choose operation not the surgery one but mathematical operation: ");
        char operation = sc.next().charAt(0);
        
        int result;
        switch (operation) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Not defined ayee!!");
                    return;
                }
                break;
            default:
                System.out.println("yous mad boi");
                return;
        }
        
        System.out.println("yo ans: " + result);
    }
}