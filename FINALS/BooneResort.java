import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    class BooneResort{
        public static void main (String[] args){
            MyFrame f = new MyFrame();
        }
    }
    
    class MyFrame extends JFrame implements ActionListener {
        
        private Container c;
        private JLabel Title;
        private JLabel Name;
        private JRadioButton Umbrella;
        private JRadioButton Mushroom;
        private JRadioButton BahayKubo;
        private ButtonGroup gengp;
        private JLabel bu;
        private JComboBox B;
        private JButton Total;
        private JTextField TP;
        
        private String  boat[]
        = { "PLEASE SELECT" , "KAYAK (PHP 500)" , "DECK BOATS (PHP 750)" , "CUDDY CABIN BOATS (PHP 1500)"};
        
    
        public MyFrame ()
        {
            setTitle("Boone Resort");
            setSize(580,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            
            c= getContentPane();
            c.setLayout(null);
            
            Title = new JLabel("BOONE RESORT");
            Title.setFont(new Font("Times New Roman",Font.BOLD, 30));
            Title.setSize(350,50);
            Title.setLocation(70,20);
            
            Name = new JLabel("COTTAGES");
            Name.setFont(new Font("Times New Roman",Font.BOLD, 30));
            Name.setSize(500,90);
            Name.setLocation(70,20);
            c.add(Name);
            
            Umbrella = new JRadioButton("Umbrella (PHP 500)");
            Umbrella.setFont(new Font("Times New Roman",Font.PLAIN, 20));
            Umbrella.setSize(500,30);
            Umbrella.setLocation(60,100);
            c.add(Umbrella);
            
            Mushroom = new JRadioButton("Mushroom (PHP 750)");
            Mushroom.setFont(new Font("Times New Roman",Font.PLAIN, 20));
            Mushroom.setSize(500,30);
            Mushroom.setLocation(60,150);
            c.add(Mushroom);
            
            BahayKubo = new JRadioButton("BahayKubo (PHP 1,500)");
            BahayKubo.setFont(new Font("Times New Roman",Font.PLAIN, 20));
            BahayKubo.setSize(500,30);
            BahayKubo.setLocation(60,200);
            c.add(BahayKubo);
            
            gengp = new ButtonGroup();
            gengp.add(Umbrella);
            gengp.add(Mushroom);
            gengp.add(BahayKubo);
            
            bu = new JLabel("BOATS");
            bu.setFont(new Font("Times New Roman",Font.BOLD, 30));
            bu.setSize(500,90);
            bu.setLocation(70,220);
            c.add(bu);
            
            B = new JComboBox (boat);
            B.setSize(250,30);
            B.setLocation(60,300);
            c.add(B);
            
            Total = new JButton ("TOTAL AMOUNT");
            Total.setFont(new Font("Times New Roman", Font.BOLD, 26));
            Total.setSize(300,30);
            Total.setLocation(120,350);
            Total.addActionListener(this);
            c.add(Total);
            
            TP = new JTextField ();
            TP.setFont(new Font("Times New Roman", Font.PLAIN, 24));
            TP.setSize(400,30);
            TP.setLocation(75,400);
            TP.setEditable(false);
            c.add(TP);
            
            setVisible(true);
        }
    
        public void actionPerformed(ActionEvent e)
        {
            int type=0;
            int boat=0;
            int tot=0;
    
            if (Umbrella.isSelected()){type=500;}
            else if (Mushroom.isSelected()){type=750;}
            else if(BahayKubo.isSelected()){type=1500;}
    
            if (B.getSelectedIndex()==0){boat=0;}
            else if(B.getSelectedIndex()==1){boat=500;}
            else if(B.getSelectedIndex()==2){boat=750;}
            else if(B.getSelectedIndex()==3){boat=1500;}
            
            tot =  type + boat;
            String finaltot = String.valueOf(tot);
            TP.setText(finaltot);
            
        }
 }