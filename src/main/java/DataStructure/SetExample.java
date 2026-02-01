package DataStructure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExample {
    static  void main(){
        // takeway if you want to have all the datatype to used in you code or project used object in it

        Set<Object> set =new HashSet<>();
        set.add(10);
        set.add("hi there");
        set.add(5.6);
        System.out.println(set);
    }
}
