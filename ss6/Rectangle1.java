package lad2.ss6;

public class Rectangle1 {
    int width;
    int height;

    Rectangle1(){
        System.out.println("Constructor Invoked");
        width=10;
        height=10;
    }
    Rectangle1(int wid, int heig){
        System.out.println("Paramaterized Constructor");
        width=wid;
        height=heig;
    }

    void displayDimensions(){
        System.out.println(width);
        System.out.println(height);
    }
}
