import java.util.Scanner;
    class ALPHABET {
           public static void main(String args[]) {
           Scanner in = new Scanner(System.in);       
           System.out.println("Enter Letter:");
           String LET = in.nextLine();
                                              
               if(!LET.matches("[a-zA-Z]+")){
                    System.out.println("Please enter a valid Letter!");
                    LET = in.nextLine();
                                 }
                
               else if(LET.length() != 1){
                    System.out.println("Please enter 1 Letter!");
                    LET = in.nextLine();
               }         
                
               else {
               switch (LET) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Input Letter " + LET + " is a VOWEL");
                    break;
                default:
                    System.out.println("Input Letter " + LET + " is a CONSONANT");
                }
            }
                
      }
}
