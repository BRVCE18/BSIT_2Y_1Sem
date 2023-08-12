import java.util.Scanner;
    class ABC {
        
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input String:");
            String ALPHA = in.nextLine();
            
            char[] NEW = ALPHA.toCharArray();
            for(int i=0; i<ALPHA.length(); i++) {
            
            if (ALPHA.charAt(i) == 'A') {NEW[i] = 'Z'; }
            if (ALPHA.charAt(i) == 'B') {NEW[i] = 'Y'; }
            if (ALPHA.charAt(i) == 'C') {NEW[i] = 'X'; }
            if (ALPHA.charAt(i) == 'D') {NEW[i] = 'W'; }
            if (ALPHA.charAt(i) == 'E') {NEW[i] = 'V'; }
            if (ALPHA.charAt(i) == 'F') {NEW[i] = 'Y'; }
            if (ALPHA.charAt(i) == 'G') {NEW[i] = 'T'; }
            if (ALPHA.charAt(i) == 'H') {NEW[i] = 'S'; }
            if (ALPHA.charAt(i) == 'I') {NEW[i] = 'R'; }
            if (ALPHA.charAt(i) == 'J') {NEW[i] = 'Q'; }
            if (ALPHA.charAt(i) == 'K') {NEW[i] = 'P'; }
            if (ALPHA.charAt(i) == 'L') {NEW[i] = 'O'; }
            if (ALPHA.charAt(i) == 'M') {NEW[i] = 'N'; }
            if (ALPHA.charAt(i) == 'N') {NEW[i] = 'M'; }
            if (ALPHA.charAt(i) == 'O') {NEW[i] = 'L'; }
            if (ALPHA.charAt(i) == 'P') {NEW[i] = 'K'; }
            if (ALPHA.charAt(i) == 'Q') {NEW[i] = 'J'; }
            if (ALPHA.charAt(i) == 'R') {NEW[i] = 'I'; }
            if (ALPHA.charAt(i) == 'S') {NEW[i] = 'H'; }
            if (ALPHA.charAt(i) == 'T') {NEW[i] = 'G'; }
            if (ALPHA.charAt(i) == 'U') {NEW[i] = 'F'; }
            if (ALPHA.charAt(i) == 'V') {NEW[i] = 'E'; }
            if (ALPHA.charAt(i) == 'W') {NEW[i] = 'D'; }
            if (ALPHA.charAt(i) == 'X') {NEW[i] = 'C'; }
            if (ALPHA.charAt(i) == 'Y') {NEW[i] = 'B'; }
            if (ALPHA.charAt(i) == 'Z') {NEW[i] = 'A'; }
            }   
            System.out.println("Output String: " + String.valueOf(NEW) );
        }
    }
    
    
