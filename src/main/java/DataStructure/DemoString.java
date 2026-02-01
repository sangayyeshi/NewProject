package DataStructure;

public class DemoString {
    static  void main(){
        // immutable string
         String s ="helo world";
        System.out.println(s);
        // mutable string
        StringBuilder sb = new StringBuilder("helo ");
        sb.append("world");
        sb.append(" this is java string concept");
        System.out.println(sb);

    }
}
