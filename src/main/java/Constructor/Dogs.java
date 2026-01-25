package Constructor;

public class Dogs {
// never to forget that name of the constructor much be same name to class
    private String name ;
    private String color;
    Dogs( String name, String color){
         this.name = name;
          this.color = color;

    }
    // create the method
    void display(){
        System.out.println("Dog name  is " + name + " and color " + color);
    }
    static void  main(){
        Dogs dogs = new Dogs("Sweta" ,"blue");
        dogs.display();
    }
}
