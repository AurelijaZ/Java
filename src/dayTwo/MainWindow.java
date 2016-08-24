package dayTwo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import static dayTwo.generatingPeople.*;

/**
 * Created by student on 24-Aug-16.
 */

public class MainWindow implements ActionListener {
    //declare the pane
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblHeight;
    private JLabel lblWeight;
    private JLabel lblBirthDate;
    private JLabel lblSex;
    private JLabel lblHireDate;
    private JLabel lblPosition;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtHeight;
    private JTextField txtWeight;
    private JTextField txtBirthDate;
    private JTextField txtSex;
    private JTextField txtHireDate;
    private JTextField txtPosition;

    //two buttons - delete and update
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

    private JList employeeList;

    //constructor

    public MainWindow() {
        JFrame mainFrame = new JFrame("Employee Database: ");
        mainFrame.setSize(800, 400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); //do not nothing when closed.
        //pop up for a message are you sure you wanna leave.
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
        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width / 2 - mainFrame.getWidth() / 2, di.height / 2 - mainFrame.getHeight() / 2);
//add mainFrame before each set/get function.

        mainFrame.addWindowListener(l);

        content = (JPanel) mainFrame.getContentPane(); //add this panel and add it to the frame
        content.setLayout(new GridLayout(1, 2, 5, 5));

        listPanel = new JPanel();
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED)); // the borders for the panel
        //scroll function
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());
        scrollPane.setPreferredSize(new Dimension(380, 335)); //set the size
        listPanel.add(scrollPane);
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

    //menu constructor
    private JMenuBar createMenu() {
        menuBar = new JMenuBar();

        //file menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); //add into menu bar
        newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_N);
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); //add into menu bar
        indexMenuItem = new JMenuItem("Search");

        indexMenuItem.setMnemonic(KeyEvent.VK_S);
        indexMenuItem.addActionListener(this);
        editMenu.add(indexMenuItem);

        menuBar.add(editMenu);

        return menuBar; //return an update version

    }

    private JList createEmployeeList() {
        employeeList = new JList(people.toArray()); //need to import it to the top
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return employeeList;
    }

    //create two more fields!
    private JPanel createFieldsPanel() {
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


        lblHeight = new JLabel("Height:");
        inputPanel.add(lblHeight);
        txtHeight = new JTextField();
        inputPanel.add(txtHeight);

        lblWeight = new JLabel("Weight:");
        inputPanel.add(lblWeight);
        txtWeight = new JTextField();
        inputPanel.add(txtWeight);

        lblBirthDate = new JLabel("Date of Birth (YYYY/MM/DD):");
        inputPanel.add(lblBirthDate);
        txtBirthDate = new JTextField();
        inputPanel.add(txtBirthDate);

        lblSex = new JLabel("SEX M/F:");
        inputPanel.add(lblSex);
        txtSex = new JTextField();
        inputPanel.add(txtSex);

        lblHireDate = new JLabel("Hire Date (YYYY/MM/DD):");
        inputPanel.add(lblHireDate);
        txtHireDate = new JTextField();
        inputPanel.add(txtHireDate);

        lblPosition = new JLabel("Job Position:");
        inputPanel.add(lblPosition);
        txtPosition = new JTextField();
        inputPanel.add(txtPosition);

        return inputPanel; //need to add into content

    }

    private JPanel createButtonPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnUpdate = new JButton("Update BOOM");
        //button needs a listener

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnPanel.add(btnUpdate);

        btnRemove = new JButton("Remove"); //dont forget to put a defined button
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPanel.add(btnRemove);
        return btnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand(); //get whatever action we found, and create new stuff
        if ("New".equals(action)) {
            fieldPanel.setVisible(true);
        }
        else if ("Exit".equals(action)) {
            System.exit(0);
        }
    }

    public JTextField getTxtBirthDate() {
        return txtBirthDate;
    }

    public JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public JTextField getTxtHeight() {
        return txtHeight;
    }

    public JTextField getTxtHireDate() {
        return txtHireDate;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public JTextField getTxtPosition() {
        return txtPosition;
    }

    public JTextField getTxtSex() {
        return txtSex;
    }

    public JTextField getTxtWeight() {
        return txtWeight;
    }

    public JPanel getInputPanel() {return inputPanel; }
}
