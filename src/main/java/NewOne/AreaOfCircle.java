package NewOne;

public class AreaOfCircle {
    private static  final  double radius = 7.5;
    static  void main(){
        //Write a Java program to print the area and perimeter of a circle.
        //Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586
double area = Math.PI*radius*radius;
double perimeter = 2*Math.PI*radius;
System.out.println("Area is = "+area);
        System.out.println("Perimeter is = "+perimeter);
    }
}
