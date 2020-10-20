package lad2;

public class ss5snippet12 {
    public static void main(String[] args) {
        int cnt, square , cube;

        for (cnt=1; cnt<300; cnt++){
            if (cnt % 3 ==0){
                continue;
            }
            square=cnt*cnt;
            cube = cnt*cnt*cnt;
            System.out.printf("\n Square of %d is %d and cube is %d",cnt,square,cube);
        }
    }
}
