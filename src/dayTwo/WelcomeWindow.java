package dayTwo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 24-Aug-16.
 */
public class WelcomeWindow extends JFrame {
    //needs to inheritance from Jframe
    //fields
    private JPanel contentPane;
    //new button
    private JButton btnEnter;
    //create new label
    private  JLabel lblWelcome;

    //constructor
    public WelcomeWindow() {
        setTitle("Welcome Frame");
        //fix size
        setSize(800,400); //overloading
        //make  sure its never resizable
        setResizable(false);
        //center the frame
       // setLocationRelativeTo(null); //did not specify the location so its gonna show up in the middle.
        Dimension di = getToolkit().getScreenSize();
        setLocation(di.width/2 - getWidth()/2, di.height/2 - getHeight()/2);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //terminates the program and everything that's not needed.

        contentPane = new JPanel();
        //set the border of the panel
        contentPane.setBorder(new EmptyBorder(5,5,5,5)); // number is for each side to set it up
        //set it to the content pane
        setContentPane(contentPane);
        //we dont want any layout in our pane
        contentPane.setLayout(null);


        btnEnter = new JButton("Enter"); //constructor of the button
        //controller - listen to any event
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //load main frame
                MainWindow mainFrame = new MainWindow(); //its gonna call another frame!
            }
        });
        //set the location of the button
        btnEnter.setBounds(360,200,70,25);
        //add a button into red pane
        contentPane.add(btnEnter);

        lblWelcome = new JLabel("Welcome to Employee Program! ");
        //set colour to the label
        lblWelcome.setForeground(Color.BLUE);
        lblWelcome.setFont( new Font("Verdana", Font.BOLD | Font.ITALIC | Font.ITALIC, 20));
        lblWelcome.setBounds(220,80,400,100);
        contentPane.add(lblWelcome);

        setVisible(true); //by default windows frame never appears, unless you run this function.


    }
}
