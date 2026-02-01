package DataStructure;

import java.util.ArrayDeque;

public class StackDemo {
    static  void  main(){
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(2);
        arrayDeque.push(3);
        arrayDeque.push(4);


        //arrayDeque.add(12);
        System.out.println(arrayDeque);

    }
}
