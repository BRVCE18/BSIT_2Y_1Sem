import java.util.Scanner;
    class GREATESTNUM {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input the 1st Number:");
            int F = in.nextInt();
            System.out.println("Input the 2nd Number:");
            int S = in.nextInt();
            System.out.println("Input the 3rd Number:");
            int T = in.nextInt();
            int G = 0;

            if(F >= S && F >= T) 
            {G = F;}
            else if (S >= F && S >= T)
            {G = S;}
            else if (T >= F && T >= S)
            {G = T;}
            
            System.out.println("The Greatest Number is: " + G);
           
}
}
    
    