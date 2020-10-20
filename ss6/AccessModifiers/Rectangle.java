package lad2.ss6.AccessModifiers;

public class Rectangle {
    private  int width;
    private int height;

    public Rectangle(){
        System.out.println("Constructor Invoker");
        width=10;
        height=10;
    }

    public Rectangle(int wid, int heig){
        System.out.println("Parameterized Constructor Invoked");
        width=wid;
        height=heig;
    }

    public void displayDimensions(){
        System.out.println(width);
        System.out.println(height);
    }
}
