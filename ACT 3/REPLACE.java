import java.util.Scanner;
    class REPLACE {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input your String");
            String INITIAL = in.nextLine();
            
            String FINAL = INITIAL.replace("A","@").replace("a","@")
            .replace("C","(").replace("c","(").replace("E","3")
            .replace("e","3").replace("G","6").replace("g","6")
            .replace("I","1").replace("i","1").replace("O","0")
            .replace("o","0").replace("S","$").replace("s","$")
            .replace("T","+").replace("t","+").replace(" ","_");
                                    
            Integer LONG = INITIAL.length();
            
            System.out.println("The length is: " + LONG);
            System.out.println("The replaced string is: " + FINAL);
        }
    }
    