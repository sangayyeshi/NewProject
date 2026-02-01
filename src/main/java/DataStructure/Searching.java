package DataStructure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Searching {
    static  void main(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        // looking for the 5 in the list in above
         int key =5;
       // linear search
        System.out.println(list.contains(key));
        int index = Collections.binarySearch(list,key);
        if(index>=0){
            System.out.println(" Element found in index "+ index);
        }else {
            System.out.println(" Element not found " + index);
        }
    }
}
