import java.util.Scanner;
    class CAFE {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input Item:");
            String ITEM = in.nextLine();
            System.out.println("Input Quantity:");
            int QTY = in.nextInt();
            int C = 0;
            
            if  (ITEM == "hot choco") {
                C = 100;}
            else if  (ITEM == "coffee") {
                C = 50;}
            
            double BILL = QTY*C;
            double NEWBILL = 0;
            
            if (BILL >= 300) {
                BILL = BILL - (BILL * 0.03);
                NEWBILL = BILL + (BILL * 0.02);}
            else {
                NEWBILL = BILL + (BILL * 0.02);}
                
            System.out.println("Total Bill: " + NEWBILL);
            }   
           
        }
    
    
    
