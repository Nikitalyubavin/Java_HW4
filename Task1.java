//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

/**
 * Task1
 */

import java.util.*;

public class Task1 {
    public static LinkedList<Integer> ReversedLL(LinkedList<Integer> list){
        LinkedList<Integer> revLL = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--){
            revLL.add(list.get(i));
        }
        return revLL;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++){
            ll.add(i, i + 5);
        }
        ll = ReversedLL(ll);
        System.out.println(ll);
    }
}