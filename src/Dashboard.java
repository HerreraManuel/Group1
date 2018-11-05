import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        Actions listener1 = new Actions();
        check1.addActionListener(listener1);

        check2 = new JCheckBox("Words");
        Actions listener2 = new Actions();
        check2.addActionListener(listener2);

        check3 = new JCheckBox("Lines");
        Actions listener3 = new Actions();
        check3.addActionListener(listener3);
        
        check4 = new JCheckBox("Source Lines");
        Actions listener4 = new Actions();
        check4.addActionListener(listener4);

        check5 = new JCheckBox("CommentLines");
        Actions listener5 = new Actions();
        check5.addActionListener(listener5);

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
        Actions urlListener = new Actions();
        urlinput.addActionListener(urlListener);
        leftside.add(urlinput);

        leftside.add(totbuttons);

        enter = new JButton("Enter");
        Actions enterListener = new Actions();
        enter.addActionListener(enterListener);
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


    public void dispose() {
        // TODO: Save settings
        //super.dispose();
        System.exit(0);
    }

   class Actions implements ActionListener{

       @Override
       public void actionPerformed(ActionEvent e) {

       }
   }
}