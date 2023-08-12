import java.util.Scanner;
    class PASSFAIL {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Your Grade in Written Works");
            float WW = in.nextFloat();
            System.out.println("Enter Your Grade in Performance Task");
            float PT = in.nextFloat();
            System.out.println("Enter Your Grade in Quarterly Exam");
            float QE = in.nextFloat();
            float A;
            float B;
            float C;
            float SUM;
            A = WW/5 * 2;
            B = PT/5 * 2;
            C = QE/5;
            SUM = A + B + C;
            System.out.println("Your Final Grade is "+ SUM);
            
            if(SUM >= 75) 
            {System.out.println("Passed");}
            else 
            {System.out.println("Failed");}
           
}
}
    
    