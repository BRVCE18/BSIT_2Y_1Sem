  import java.util.Scanner;
    class LEAPYEAR {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input A Year:");
            short YEAR = in.nextShort();
            
                if (YEAR % 4 == 0) {
                    System.out.println(YEAR + " is a Leap Year ");
                }
                else {
                    System.out.println(YEAR + " is not a Leap Year ");  
                }
                
            }  
}
    
    
