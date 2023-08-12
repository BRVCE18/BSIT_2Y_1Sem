import java.util.Scanner;
class Eggs {
    public static void main(String args[]) {
        Scanner egg = new Scanner(System.in);
        int numberofEggs = egg.nextInt();
        
        dozen(numberofEggs);
    }
    
    static void dozen(int eggs) {
        
        int DOZEN = eggs/12;
        int REMAINDER = eggs%12;
        
        System.out.println("The number of Full Dozens is " 
        + DOZEN + " with " + REMAINDER + " leftovers");
    }
}