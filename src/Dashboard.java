import javax.swing.*;

public class Dashboard extends JFrame {

//    private JFrame window;
    private JPanel leftside;
    private JPanel rightside;

    private JTextArea Display;
    private JScrollPane scroll;
    private JTextArea totals;

    private JLabel instructions;
    private JTextField urlinput;
    private JPanel totbuttons;
    private JCheckBox check1;
    private JCheckBox check2;
    private JCheckBox check3;
    private JCheckBox check4;
    private JCheckBox check5;
    private JTextArea additional;
    private JButton enter;


    private boolean initialized = false;
    private Actions actions = new Actions();

    public static void main (String args[]){
        new Dashboard().setVisible(true);
    }

    public void setVisible(boolean visible ){
        initialize();
        super.setVisible(visible);
    }

    private void initialize(){
        initializeGui();
        initializeEvents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void initializeGui(){
        if(initialized){
            return;
        }
        initialized  = true;
        this.setLayout(new FlowLayout());
        this.setSize(500, 400);
        //TODO: add in your layers and everything else in here
        check1 = new JCheckBox("Characters");
        check1.addActionListener(this);

        check2 = new JCheckBox("Words");
        check2.addActionListener(this);

        check3 = new JCheckBox("Lines");
        check3.addActionListener(this);
        
        check4 = new JCheckBox("Source Lines");
        check4.addActionListener(this);

        check5 = new JCheckBox("CommentLines");
        check5.addActionListener(this);

        totbuttons.setLayout(new BoxLayout(totbuttons, BoxLayout.Y_AXIS));
        totbuttons.add(check1);
        totbuttons.add(check2);
        totbuttons.add(check3);
        totbuttons.add(check4);
        totbuttons.add(check5);

        leftside.setLayout(new BoxLayout(leftside, BoxLayout.Y_AXIS));
        instructions = new JLabel("Enter Github URL");
        leftside.add(instructions);

        urlinput = new JTextField(60);
        urlinput.addActionListener(this);
        leftside.add(urlinput);

        leftside.add(totbuttons);

        enter = new JButton("Enter");
        enter.addActionListener(this);
        leftside.add(enter);

        this.add(leftside);

        Display = new JTextArea();
        Display.setEditable(false);
        scroll = new JScrollPane(Display);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        rightside.add(scroll);
        rightside.add(Display);
        totals = new JTextArea();
        rightside.add(totals);

        this.add(rightside);
    }

    private void initializeEvents(){
        //TODO : add action listeners and events that can happen
    }

    public class Actions implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            command = command == null ? "" : command;
            // TODO: add if...if else... for action commands

        }
    }

    public void dispose() {
        // TODO: Save settings
        //super.dispose();
        System.exit(0);
    }
}