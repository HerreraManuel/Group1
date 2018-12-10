import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    private JFrame window;
    private JPanel leftside, urlPanel, additionalPanel, totbuttons, enterPanel, outputDisplay, spacingPanel;
    private JPanel rightside;
    DataProcessor githandler;

    private JTextArea labels, Display, totals;

    private JLabel githubUrlInput, additionalInput, space;
    private JTextField urlinput, additionalText;
    private JCheckBox check1, check2, check3, check4, check5;
    private JButton enter, clear, exit;
    private String completeUrl;
    private String[] searchCriteria;

    private boolean initialized = false;
    /*
    Creates the Gui and sets it to visible
    */
    public static void main(String args[]) {
        new Dashboard().setVisible(true);
    }

    /*
    starts to build the GUI by setting it to visible
    */
    public void setVisible(boolean visible) {
        initialize();
        // super.setVisible(visible);
    }

    /*
    Initializes the GUI then sets how the program is meant to close
    */
    private void initialize() {
        initializeGui();
        //initializeEvents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /*
    Creates the Gui.
    This does just about everything about establishing the gui and setting which buttons does what.
    it also adds the different panels and buttons together
    */
    private void initializeGui() {

        if (initialized) {
            return;
        }

    /*
    sets the layout and initial size of the window that the GUI will be displayed in
    For the purpose of having as much room as possible the initial size will be the entire screen size of the given
    computer
    */
        initialized = true;
        window = new JFrame("Metrics");
        window.setLayout(new FlowLayout(FlowLayout.LEADING));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize((int)screenSize.getWidth(),300);
     /*
     establishes all the panel that will be put together and establish their layout.
     see design document to see how they work together
     */
        leftside = new JPanel();
        leftside.setLayout(new BoxLayout(leftside, BoxLayout.Y_AXIS));
        leftside.setSize((int)screenSize.getWidth()/2, (int)screenSize.getHeight());

        rightside = new JPanel();
        rightside.setLayout(new FlowLayout(FlowLayout.LEADING));
        rightside.setSize((int)screenSize.getWidth()/2, (int)screenSize.getHeight());

        urlPanel = new JPanel();
        urlPanel.setLayout(new BoxLayout(urlPanel, BoxLayout.Y_AXIS));

        additionalPanel = new JPanel();
        additionalPanel.setLayout(new BoxLayout(additionalPanel, BoxLayout.Y_AXIS));

        totbuttons = new JPanel();
        GridLayout grid = new GridLayout(2, 3);
        totbuttons.setLayout(grid);

        enterPanel = new JPanel();
        enterPanel.setLayout(new BoxLayout(enterPanel,BoxLayout.X_AXIS));

        spacingPanel = new JPanel();
        spacingPanel.setLayout(new BoxLayout(spacingPanel, BoxLayout.Y_AXIS));

        outputDisplay = new JPanel();
        GridLayout grid2 = new GridLayout(1, 2);
        outputDisplay.setLayout(grid2);

    /*
    puts together all of the buttons and check boxes
    establishes what each button should do and what the label is
    */
        githubUrlInput = new JLabel("Enter valid Github URL");
        urlPanel.add(githubUrlInput);
        urlinput = new JTextField(10);
        urlinput.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        completeUrl = urlinput.getText();
                    }
                });
        urlPanel.add(urlinput);
        leftside.add(urlPanel);

        check1 = new JCheckBox("Characters");
        check2 = new JCheckBox("Words");
        check3 = new JCheckBox("Lines");
        check4 = new JCheckBox("Source Lines");
        check5 = new JCheckBox("Comment Lines");

    /*
    additional input panel is just meant to take in file types to be displayed delimited by a space
    */
        additionalInput = new JLabel("Enter file suffix to search (EX: .java .txt .c) separated by spaces");
        additionalText = new JTextField(10);
        additionalPanel.add(additionalInput);
        additionalPanel.add(additionalText);
        leftside.add(additionalPanel);
    /*
    combining buttons and panels together to create GUI layers
    */
        totbuttons.setLayout(new BoxLayout(totbuttons, BoxLayout.Y_AXIS));
        totbuttons.add(check1);
        totbuttons.add(check2);
        totbuttons.add(check3);
        totbuttons.add(check4);
        totbuttons.add(check5);
        leftside.add(totbuttons);

        //enter button runs the process to output the metrics
        enter = new JButton("Enter");
        enterPanel.add(enter);

        space = new JLabel("   ");
        enterPanel.add(space);

        //clear button clears all areas of text and resets buttons
        clear = new JButton("Clear");
        enterPanel.add(clear);

        space = new JLabel("   ");
        enterPanel.add(space);

        exit = new JButton("Exit");
        enterPanel.add(exit);

        leftside.add(enterPanel);
        window.add(leftside);

        labels = new JTextArea("");
        labels.setSize(50,200);
        labels.setEditable(false);
        Display = new JTextArea("");
        Display.setEditable(false);
        totals = new JTextArea("");
        totals.setEditable(false);
        totals.setSize(50,200);
        JScrollPane scroll = new JScrollPane(Display);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(600,210));
        rightside.add(labels);
        rightside.add(scroll);
        rightside.add(totals);
        window.add(rightside);
        window.setVisible(true);




        enter.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        completeUrl = urlinput.getText();
                        searchCriteria = additionalText.getText().trim().split(" ");
                        displayData();
                    }
                });


        clear.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        Display.setText(null);
                        totals.setText(null);
                        labels.setText(null);
                        check1.setSelected(false);
                        check2.setSelected(false);
                        check3.setSelected(false);
                        check4.setSelected(false);
                        check5.setSelected(false);
                        urlinput.setText(null);
                        additionalText.setText(null);
                    }
                });

        exit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                      dispose();
                    }
                });
    }

    /*
    This should be a way to close the program that can be called should we want to add a close button, but it might go
    unused for the purpose of this project
    */
    public void dispose() {
        super.dispose();
        System.exit(0);
    }

    /*
    this method will call the GitParser and pass in the github url as a parameter.
    it will then get back the necessary metrics from GitParser and display it in the scrollable text area and the totals
    text area.
    */
    private void displayData() {
        String[][] current = new String[0][0];
        try{
            String Url = completeUrl.trim();
            githandler = new DataProcessor(Url,searchCriteria);
            current = githandler.getCompleteFile();
            if(current.equals(null)){
                Display.setText("No files matching the search criteria were found");
            }else {
                FileManager manager = new FileManager(current, getDisplaySettings(), getDisplayAll());
                labels.setText(manager.getRowLabels());
                Display.setText(manager.getFileDisplay());
                totals.setText(String.valueOf(manager.getTotals()));
            }
        }catch(Exception e){
            e.printStackTrace();
            Display.setText(" An error has occurred. \n Make sure that you entered a valid github URL and/or search criteria ");
        }
    }


    /*
    This returns the booleans of all dispaly items for the output.
    The isSelected is used to go around an action listener and use the functionality of the JCheckBox
    */
    private boolean[] getDisplaySettings(){
        boolean [] displaySettings = new boolean [5];
        boolean displayAll = getDisplayAll();
        displaySettings [0] = (check1.isSelected() || displayAll);
        displaySettings [1] = (check2.isSelected() || displayAll);
        displaySettings [2] = (check3.isSelected() || displayAll);
        displaySettings [3] = (check4.isSelected() || displayAll);
        displaySettings [4] = (check5.isSelected() || displayAll);
        return displaySettings;
    }

    /*
    checks to see if all of the checkboxes are unselected to diplay the proper information
     */
    private boolean getDisplayAll(){
        boolean displayAll = false;
        if(!check1.isSelected() && !check2.isSelected() && !check3.isSelected() && !check4.isSelected() && !check5.isSelected()){
            displayAll = true;
        }

        return displayAll;
    }

}
