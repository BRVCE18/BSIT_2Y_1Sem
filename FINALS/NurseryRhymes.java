
import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
public class NurseryRhymes {
NurseryRhymes() {
    
    JFrame A = new JFrame("NurseryRhymes");
    
    JButton Bstar = new JButton("Twinkle, twinkle little star");
    Bstar.setBounds(85,10,0,0);
    Bstar.setSize(200,30);
    
    JButton Bhumpty = new JButton("Humpty Dumpty");
    Bhumpty.setBounds(85,45,0,0);
    Bhumpty.setSize(200,30);
    
    JButton Bjack = new JButton("Jack and Jill");
    Bjack.setBounds(85,80,0,0);
    Bjack.setSize(200,30);
    
    JTextArea Lyrics = new JTextArea("");
    Lyrics.setBounds(40,150,300,300);
    Lyrics.setLineWrap(true);
    
    A.add(Bstar);
    A.add(Bhumpty);
    A.add(Bjack);
    A.add(Lyrics);
    
    A.setSize(400,700);
    A.setLayout(null);
    A.setVisible(true);
    
    Bstar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Lyrics.setText("Twinkle, twinkle, little star, How I wonder what you are, Up above the world so high, Like a diamond in the sky, twinkle, twinkle, little star, How I wonder what you are.");
        
    }  
    });
    
    Bhumpty.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Lyrics.setText("Humpty Dumpty sat on a wall Humpty Dumpty had a great fall All the king’s horses and all the king’s men Couldn’t put Humpty together again.");
       
    }  
    });
    
    Bjack.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Lyrics.setText("Jack and Jill went up the hill To fetch a pail of water. Jack fell down and broke his crown, And Jill came tumbling after. Up Jack got, and home did trot, As fast as he could caper, He went to bed to mend his head, With vinegar and brown paper.");
        
    }  
    });
}
   
public static void main(String[] args) {
    new NurseryRhymes();
}
}