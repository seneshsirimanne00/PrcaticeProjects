public class chess {
    public static void main(String[] args) {
        int x=0;
        for(int n=1;n<=64;n++) {
            System.out.println("2 ^ "+n+" ==> "+Math.pow(2, n));
            x = (int) (x + Math.pow(2, n));
        }
        System.out.println("Total amount of grains : "+x);


    }

}
