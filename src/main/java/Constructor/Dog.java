package Constructor;

public class Dog {
    private String name;
    private  String color;

    Dog() {
        this.name="bule";
        this.color="red";
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    static  void main(){
        // create the object
        Dog dog= new Dog();
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        }

    }

