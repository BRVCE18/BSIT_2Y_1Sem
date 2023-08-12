import java.util.Scanner;
    class NUMBERS {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input an Integer");
            
            int M, N, SUM = 0;
            M = in.nextInt();
            while(M > 0)
            {
            N = M % 10;
            SUM = SUM + N;
            M = M / 10;
           }
           
           if  (M % SUM == 0) {
               System.out.println("HI FIVE!");
            }
           else if (M % SUM != 0) {
               System.out.println("NICE TRY!");
            }
        
        }
}
    
    
