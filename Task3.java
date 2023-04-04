import java.util.Scanner;

public class Task3 {
    static void delete(double a, double b) {
        if (b == 0) System.out.println("Делить на ноль нельзя!");
        else {
            double res = a / b;
            System.out.println(res);
        }
    }

    static double multi(double a, double b) {
        return a * b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double minus(double a, double b) {
        return a - b;
    }

    static void menu(int num, double a, double b) {
        if (num == 1) System.out.printf("Результат сложения: %s\n", sum(a, b));
        else if (num == 2) System.out.printf("Результат вычитания: %s\n", minus(a, b));
        else if (num == 3) System.out.printf("Результат умножения: %s\n", multi(a, b));
        else if (num == 4){
            System.out.print("Результат деления: ");
            delete(a, b);
        }
        else if (num == 5) System.out.print("Последняя операция удалена!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Операции: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        System.out.print("Введите значение операции: ");
        int operation = sc.nextInt();
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();
        sc.close();

        menu(operation, a, b);
    }
}
