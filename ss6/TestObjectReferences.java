package lad2.ss6;

public class TestObjectReferences {
    public static void main(String[] args) {
        Rectangle1 objRec1 = new Rectangle1(10,20);
        Rectangle1 objRec2;

        objRec2 = objRec1;
        System.out.println("objRec1");
        objRec1.displayDimensions();

        System.out.println("objRec2");
        objRec2.displayDimensions();
    }
}
