import java.util.Scanner;
    class INITIALS {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input your Full Name");
            String NAME = in.nextLine();

            String[] NEWNAME = NAME.split(" ",5);
            for (String a : NEWNAME)
             System.out.print(a.toUpperCase().charAt(0));
        }
}
    
    
