package Oops;

public class Student {
    int id ;
    String name;

    Student( int id, String name){
        this.id= id ;
          this.name= name;

    }

    static  void  main(){
        Student student = new Student(1,"sangay");
        System.out.println( student.id);
        System.out.println( student.name);
    }
}
