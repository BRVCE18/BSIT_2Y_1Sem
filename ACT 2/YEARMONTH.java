  import java.util.Scanner;
    class YEARMONTH {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input A Month Number 1-12:");
            short MONTH = in.nextShort();
            System.out.println("Input A Year:");
            short YEAR = in.nextShort();
            short DAY;
            
            switch (MONTH)
            {
            case 1:
                System.out.println("January " + YEAR + " has 31 days ");
            break;
            case 2:
                if (YEAR % 4 == 0) {
                System.out.println("February " + YEAR + " has 29 days ");
                }
                else {
                System.out.println("February " + YEAR + " has 28 days ");  
                }
            break;
            case 3:
                System.out.println("March " + YEAR + " has 31 days ");
            break;
            case 4:
                System.out.println("April " + YEAR + " has 30 days ");
            break;
            case 5:
                System.out.println("May " + YEAR + " has 31 days ");
            break;
            case 6:
                System.out.println("June " + YEAR + " has 30 days ");
            break;
            case 7:
                System.out.println("July " + YEAR + " has 31 days ");
            break;
            case 8:
                System.out.println("August " + YEAR + " has 31 days ");
            break;
            case 9:
                System.out.println("September " + YEAR + " has 30 days ");
            break;
            case 10:
                System.out.println("October " + YEAR + " has 31 days ");
            break;
            case 11:
                System.out.println("November " + YEAR + " has 30 days ");
            break;
            case 12:
                System.out.println("December " + YEAR + " has 31 days ");
            break;
                
            }  
}
}
    
    
