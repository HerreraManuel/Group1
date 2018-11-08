import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    private JFrame window;
    private JPanel leftside, urlPanel, additionalPanel , totbuttons, enterPanel;
    private JPanel rightside;

    private JTextArea Display;
    private JScrollPane scroll;
    private JTextArea totals;

    private JLabel githubUrlInput, additionalInput;
    private JTextField urlinput, additionalText;
    private JCheckBox check1, check2, check3, check4, check5;
    private JButton enter, clear;
  	private String completeUrl;
  	private boolean chars, words, lines , Sloc ,Cloc;
    private boolean initialized = false;

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
        
        leftside = new JPanel();
        leftside.setLayout(new BoxLayout(leftside , Y_AXIS));
        
        rightside = new JPanel();
        rightside.setLayout(new BoxLayout(rightside, X_AXIS);
        
        urlPanel = new JPanel();
        urlPanel.setLayout(new BoxLayout(urlPanel , Y_AXIS));
             
        additionalPanel = new JPanel();
        additionalPanel.setLayout(new BoxLayout(additionalPanel, Y_AXIS
        
        totbuttons = new JPanel();
        GridLayout grid = new GridLayout(2,3);
        totbuttons.setLayout(grid);
        
        enterPanel = new JPanel();
        enterPanel.setLayout(new BoxLayout(enterPanel, X_AXIS);
        
        //TODO: add in your layers and everything else in here
    
        githubUrlInput = new JLabel("Enter Github URL");
        urlPanel.add(githubUrlInput);
        urlinput = new JTextField(60);
        urlinput.addActionListener(new ActionListener(){
            public void actionPErformed(ActionEvent e){
                completeUrl = urlInput.getText();
            }
        });
        urlPanel.add(urlinput);
        leftside.add(urlPanel);                                
                             
         
                             
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
        leftside.add(totbuttons);
        
        enter = new JButton("Enter");
      	enter.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		displayData();		
        	}
      	});
        enterPanel.add(enter);
        clear = new JButton("Clear");
        clear.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
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
        totals = new JtextArea();
        rightside.add(totals);
        window.add(rightside);
    }
                                 
    public void dispose() {
        super.dispose();
        System.exit(0);
    }
                                 
  private void displayData(){
  		//TODO : send all data into other classes to be used and then display it
  }
}
