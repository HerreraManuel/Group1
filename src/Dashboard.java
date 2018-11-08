import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    private JFrame window;
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
  	private String complete url;
  	private boolean chars, words, lines , Sloc ,Cloc;


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
        window = new JFrame("Metrics");
        window.setLayout(new FlowLayout());
        window.setSize(500, 400);
        //TODO: add in your layers and everything else in here
      
        check1 = new JCheckBox("Characters");
        check1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         	chars = true; 
        });

        check2 = new JCheckBox("Words");
        Actions listener2 = new Actions();
        check2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         	words = true; 
        });

        check3 = new JCheckBox("Lines");
        check3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         	lines = true; 
        });
        
        check4 = new JCheckBox("Source Lines");
        check4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         	Sloc = true; 
        });

      check5 = new JCheckBox("CommentLines");
      check5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         	Cloc = true; 
        }
      });

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
      	enter.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		displayData();		
        	}
      	});
        leftside.add(enter);

        window.add(leftside);

        Display = new JTextArea();
        Display.setEditable(false);
        scroll = new JScrollPane(Display);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        rightside.add(scroll);
        rightside.add(Display);
        totals = new JTextArea();
        rightside.add(totals);

        window.add(rightside);
    }
                                 
    public void dispose() {
        // TODO: Save settings
        super.dispose();
        System.exit(0);
    }
                                 
  private void displayData(){
  		//TODO : send all data into other classes to be used and then display it
  }
}
