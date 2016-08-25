package addressBook;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by student on 25-Aug-16.
 */
public class MainWindow implements ActionListener {

    private JLabel lblBirthData, lblFirstName, lblLastName;
    private JLabel lblFirstLine, lblPostcode;
    private JLabel lblEmail, lblFacebook, lblPhoneNum, lblTwitter;

    private JTextField textBirthDate, textFirstName, textLastName;
    private JTextField textFirstLine, textPostcode;
    private JTextField textEmail, textFacebook, textPhoneNum, textTwitter;

    //create 2 buttons
    private JButton btnUpdate;
    private JButton btnRemove;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;

    private JPanel content;
    private JPanel listPanel; // left side of the panel
    private JPanel fieldPanel; //right hand side of panel
    private JPanel inputPanel;
    private JPanel btnPanel;

   private JList addressList;

    public MainWindow() {
        JFrame mainFrame = new JFrame("Address Book: ");
        mainFrame.setSize(800, 400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); //do nothing when closed.

        //pop up message tpo make sure the user is sure wants exit
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame, "Are you sure you want to leave?",
                        "Exit Confirmation.",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if (confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }
            }
        };

        //sets the window to the middle
        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width / 2 - mainFrame.getWidth() / 2, di.height / 2 - mainFrame.getHeight() / 2);
//add mainFrame before each set/get function.

        //content frame
        mainFrame.addWindowListener(l); //its listening to the exit frame just above in pop messages

        content = (JPanel) mainFrame.getContentPane(); //add this panel and add it to the frame
        content.setLayout(new GridLayout(1, 2, 5, 5));

        prepareJList();

        listPanel = new JPanel();
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED)); // the borders for the panel
        //scroll function
        JScrollPane scrollPane = new JScrollPane(createAddressList());
        scrollPane.setPreferredSize(new Dimension(380, 335)); //set the size
        listPanel.add(scrollPane);
        listPanel.setVisible(false);
        content.add(listPanel);

        fieldPanel = new JPanel();
        //tittle border
        TitledBorder title;
        title = BorderFactory.createTitledBorder(("Employee's Details"));
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER);
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH);
        fieldPanel.setVisible(false);

        content.add(fieldPanel);

        mainFrame.setJMenuBar(createMenu());

        mainFrame.setVisible(true);
    }

    //create an constructor

    private JPanel createFieldsPanel () {

        
    }
    }
