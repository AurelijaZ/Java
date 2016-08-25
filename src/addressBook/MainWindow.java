/* package addressBook;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

 /**
 * Created by student on 25-Aug-16.
 */
/* public class MainWindow implements ActionListener {

    private JLabel lblBirthDate, lblFirstName, lblLastName;
    private JLabel lblFirstLine, lblPostcode;
    private JLabel lblEmail, lblFacebook, lblPhoneNum, lblTwitter;

    private JTextField txtBirthDate, txtFirstName, txtLastName;
    private JTextField txtFirstLine, txtPostcode;
    private JTextField txtEmail, txtFacebook, txtPhoneNum, txtTwitter;

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
    private JPanel createAddressList;

    private JList addressList;

    private int employeeIndex = -1;
    private boolean createNew;




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

        lblBirthDate = new JLabel("Date of Birth (YYYY/MM/DD):");
        inputPanel.add(lblBirthDate);
        txtBirthDate = new JTextField();
        inputPanel.add(txtBirthDate);

        inputPanel = new JPanel();
        //create ingrid inside of it
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5));
        lblFirstName = new JLabel("First Name:");
        inputPanel.add(lblFirstName);
        txtFirstName = new JTextField();
        inputPanel.add(txtFirstName);

        lblLastName = new JLabel("Last Name:");
        inputPanel.add(lblLastName);
        txtLastName = new JTextField();
        inputPanel.add(txtLastName);

        lblFirstLine = new JLabel("First Line of Address:");
        inputPanel.add(lblFirstLine);
        txtFirstLine = new JTextField();
        inputPanel.add(txtFirstLine);

        lblPostcode = new JLabel("Postcode:");
        inputPanel.add(lblPostcode);
        txtPostcode = new JTextField();
        inputPanel.add(txtPostcode);

        lblEmail = new JLabel("Email:");
        inputPanel.add(lblEmail);
        txtEmail = new JTextField();
        inputPanel.add(txtEmail);

        lblFacebook = new JLabel("Facebook:");
        inputPanel.add(lblFacebook);
        txtFacebook = new JTextField();
        inputPanel.add(txtFacebook);

        lblPhoneNum = new JLabel("Phone Number:");
        inputPanel.add(lblPhoneNum);
        txtPhoneNum = new JTextField();
        inputPanel.add(txtPhoneNum);

        return inputPanel;
    }
     private JPanel createButtonPanel() {
         btnPanel = new JPanel();
         btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

         btnUpdate = new JButton("Update");
         //button needs a listener

         btnUpdate.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) { //new section to create new employees + create a list that will
                 if (createNew) {
                     //create a list to add into the system.
                     TaskProcessing.createContact(getFieldsInfo());
                     createAddressList();
                     createNew = false;
                     clearTxtFields(); //once its created then clear the field.
                 } else {
                     TaskProcessing.editDetail(employeeIndex, getFieldsInfo());
                     createAddressList();
                 }
                 createNew = false;
                 employeeIndex = -1;
             }
         });
         private java.util.List<String> getFieldsInfo() {
             java.util.List<String> data = new ArrayList<>();

             data.add(txtFirstName.getText());
             data.add(txtLastName.getText());


             String[] stringDob = txtBirthDate.getText().split("-");
             data.add(stringDob[0]);
             data.add(stringDob[1]);
             data.add(stringDob[2]);



             String[] stringHireDate = txtHireDate.getText().split("-");
             data.add(stringHireDate[0]);
             data.add(stringHireDate[1]);
             data.add(stringHireDate[2]);

             data.add(txtPosition.getText());
             return data;

         }
*/