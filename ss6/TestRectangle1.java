package lad2.ss6;

public class TestRectangle1 {
    public static void main(String[] args) {
        Rectangle1 objRec1 = new Rectangle1(10,20);
        Rectangle1 objRec2 = new Rectangle1(6,9);

        System.out.println("Rectangle1 Details");
        objRec1.displayDimensions();

        System.out.println("Rectangle2 Details");
        objRec2.displayDimensions();
    }
}
