package lad2;

public class ss5snippet13 {
    public static void main(String[] args) {
        int i;
        outer:
        for (i=0;i<5;i++){
            if (i==2){
                System.out.println("Hello");
                break outer;
            }
            System.out.println("this is the outer loop");
        }
    }
}
