import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    private JFrame window;
    private JPanel leftside, urlPanel, additionalPanel, totbuttons, enterPanel;
    private JPanel rightside;

    private JTextArea Display;
    private JScrollPane scroll;
    private JTextArea totals;

    private JLabel githubUrlInput, additionalInput;
    private JTextField urlinput, additionalText;
    private JCheckBox check1, check2, check3, check4, check5;
    private JButton enter, clear;
    private String completeUrl;
    private boolean chars, words, lines, Sloc, Cloc;
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
        window.setLayout(new FlowLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
         /*
         establishes all the panel that will be put together and establish their layout.
         see design document to see how they work together
         */
        leftside = new JPanel();
        leftside.setLayout(new BoxLayout(leftside, BoxLayout.Y_AXIS));
        rightside = new JPanel();
        rightside.setLayout(new BoxLayout(rightside, BoxLayout.X_AXIS));
        urlPanel = new JPanel();
        urlPanel.setLayout(new BoxLayout(urlPanel, BoxLayout.Y_AXIS));
        additionalPanel = new JPanel();
        additionalPanel.setLayout(new BoxLayout(additionalPanel, BoxLayout.Y_AXIS));
        totbuttons = new JPanel();
        GridLayout grid = new GridLayout(2, 3);
        totbuttons.setLayout(grid);
        enterPanel = new JPanel();
        enterPanel.setLayout(new BoxLayout(enterPanel,BoxLayout.X_AXIS));
        /*
        puts together all of the buttons and check boxes
        establishes what each button should do and what the label is
        */
        githubUrlInput = new JLabel("Enter Github URL");
        urlPanel.add(githubUrlInput);
        urlinput = new JTextField(60);
        urlinput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                completeUrl = urlinput.getText();
            }
        });
        urlPanel.add(urlinput);
        leftside.add(urlPanel);
        check1 = new JCheckBox("Characters");
        check1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chars = true;
            }
        });
        check2 = new JCheckBox("Words");
        check2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                words = true;
            }
        });
        check3 = new JCheckBox("Lines");
        check3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lines = true;
            }
        });
        check4 = new JCheckBox("Source Lines");
        check4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sloc = true;
            }
        });
        check5 = new JCheckBox("CommentLines");
        check5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cloc = true;
            }
        });

        additionalInput = new JLabel("Enter file type that you would like to view. Such as .java .c or .hpp separated by spaces.");
        additionalText = new JTextField(60);
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
        enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayData();
            }
        });
        enterPanel.add(enter);
        clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Display.setText(null);
                totals.setText(null);
                check1.setSelected(false);
                chars = false;
                check2.setSelected(false);
                words = false;
                check3.setSelected(false);
                lines = false;
                check4.setSelected(false);
                Sloc = false;
                check5.setSelected(false);
                Cloc = false;
                urlinput.setText(null);
                additionalText.setText(null);
            }
        });
        enterPanel.add(clear);
        leftside.add(enterPanel);
        window.add(leftside);
        Display = new JTextArea();
        Display.setEditable(false);
        scroll = new JScrollPane(Display);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        rightside.add(scroll);
        totals = new JTextArea();
        rightside.add(totals);
        window.add(rightside);
        window.setVisible(true);
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
        //TODO : send url into GitParser to be used and then display it
    }
}
