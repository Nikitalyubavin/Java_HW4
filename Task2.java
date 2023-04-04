/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
*/
import java.util.Scanner;
import java.util.*;


public class Task2 {
    static Queue<Integer> Enqueue(Queue<Integer> list) {
        System.out.print("Введите число, которое ххотите добавить в конец списка: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        list.add(num);
        return list;
    }

    static int Dequeue(Queue<Integer> list) {
        int i = list.peek();
        list.remove();
        return i;
    }

    static int First(Queue<Integer> list) {
        return list.peek();
    }
    
    public static void main(String[] args) {
        Queue<Integer> newQ = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            newQ.add(i+10);
        }
        Enqueue(newQ);
        System.out.println(newQ);

        System.out.println(Dequeue(newQ));
        System.out.println(newQ);

        System.out.println(First(newQ));
        System.out.println(newQ);
    }
}
