package Constructor;

public class Cat {
    // when you create  the constructor  name must be same to class name
    private  String name;
    private  int age;
    Cat(){
        this.name ="unknow";
        this.age=0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static  void main(){
        // creating the object of cat
         Cat cat = new Cat();
        System.out.println(cat.getAge());;
        System.out.println(cat.getName());;

    }
}
