package dayTwo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import static dayTwo.generatingPeople.*;

import java.util.ArrayList;
import java.util.List;

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
    //text boxes
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

    private int employeeIndex = -1;

    private boolean createNew;

    //constructor

    public MainWindow() {
        JFrame mainFrame = new JFrame("Employee Database: ");
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
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());
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

    //menu constructor
    private JMenuBar createMenu() {
        menuBar = new JMenuBar();

        //file menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); //add into menu bar
        newMenuItem = new JMenuItem("New"); //make sure the page is blank when pressed on new
        newMenuItem.addActionListener(this); //evoke controller to receive when the user clicks on the option.
        fileMenu.add(newMenuItem);

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_N);
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);


        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); //add into menu bar
        indexMenuItem = new JMenuItem("Search"); //get a pop to enter the first name to search the employee

        indexMenuItem.setMnemonic(KeyEvent.VK_S);
        indexMenuItem.addActionListener(this);
        editMenu.add(indexMenuItem);

        menuBar.add(editMenu);

        return menuBar; //return an update version

    }
    private void prepareJList() {
        employeeList = new JList(); //need to import it to the top
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //this method gets executed when the user selects the list, and then this will start to work
        employeeList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                    employeeIndex = employeeList.getSelectedIndex();
                    //check whether our collection is empty
                    if(people.size() > 0 && employeeIndex != -1) //if there are records, load it
                        loadEmployeeFields(employeeIndex);
                    else
                        clearTxtFields(); //if its empty leave it empty
                }


        });
    }

    private JList createEmployeeList() { //this function creates dynamically reloads the list
        DefaultListModel listModel = new DefaultListModel(); //if this method is called, new collection list is created
        if (people.size() > 0 ) { //checks if we have the list
            for (Employee e : people)
                listModel.addElement(e);
        }
        employeeList.setModel(listModel);

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

        btnUpdate = new JButton("Update");
        //button needs a listener

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //new section to create new employees + create a list that will
                if (createNew && employeeList.isSelectionEmpty()) {
                    //create a list to add into the system.
                    TaskProcessing.createEmployee(getFieldsInfo());
                    createEmployeeList();
                    createNew = false;
                    clearTxtFields(); //once its created then clear the field.
                } else {
                    TaskProcessing.editDetail(employeeIndex, getFieldsInfo());
                    createEmployeeList();
                }
                createNew = false;
                employeeIndex = -1;
            }
        });

        btnPanel.add(btnUpdate);

        btnRemove = new JButton("Remove"); //don't forget to put a defined button
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (employeeIndex >= 0) {
                    TaskProcessing.removeEmployee(employeeIndex);
                    clearTxtFields();
                    createEmployeeList();
                    employeeIndex = -1;
                } else
                    JOptionPane.showMessageDialog(null, "No Employee Selected");

            }

        });
        btnPanel.add(btnRemove);
        return btnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand(); //get whatever action we found, and create new stuff
        if ("New".equals(action)) {
            clearTxtFields();
            if(employeeIndex < 0)
            createNew = true;
            listPanel.setVisible(true);
            fieldPanel.setVisible(true);
        }
        else if ("Exit".equals(action)) {
            System.exit(0);
        } else if ("Search".equals(action)) {
            String fnSearch = JOptionPane.showInputDialog("Enter first name:");
            employeeIndex = TaskProcessing.searchByFirstName(fnSearch);

            if(employeeIndex != -1 ){
            loadEmployeeFields(employeeIndex);
            fieldPanel.setVisible(true); }

            else {
            JOptionPane.showMessageDialog(null, "Cannot find it"); }
        }
    }

    //create a method to clear text
    private void clearTxtFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
        txtBirthDate.setText("");
        txtSex.setText("");
        txtHireDate.setText("");
        txtPosition.setText("");
        createNew = true;
    }
    //get the index of the person and print the information into the field.
    private  void loadEmployeeFields (int index) {
        txtFirstName.setText(people.get(index).getFirstName());
        txtLastName.setText((people.get(index).getLastName()));
        txtHeight.setText(Short.toString(people.get(index).getHeight()));
        txtWeight.setText(Double.toString(people.get(index).getWeight()));
        txtBirthDate.setText(people.get(index).getBirthDate().toString());
        txtSex.setText(people.get(index).getSex().toString());
        txtHireDate.setText(people.get(index).getHireDate().toString());
        txtPosition.setText(people.get(index).getPosition());

    }
    private java.util.List<String> getFieldsInfo() {
        List<String>data = new ArrayList<>();

        data.add(txtFirstName.getText());
        data.add(txtLastName.getText());
        data.add(txtHeight.getText());
        data.add(txtWeight.getText());

        String[] stringDob = txtBirthDate.getText().split("-");
        data.add(stringDob[0]);
        data.add(stringDob[1]);
        data.add(stringDob[2]);

        data.add(txtSex.getText());

        String[] stringHireDate = txtHireDate.getText().split("-");
        data.add(stringHireDate[0]);
        data.add(stringHireDate[1]);
        data.add(stringHireDate[2]);

        data.add(txtPosition.getText());
        return data;

    }
}
