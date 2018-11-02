import javax.swing.*;

public class Dashboard extends JFrame {

    private JFrame window;
    private JPanel leftside;
    private JPanel rightside;
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
        this.setSize(500, 400);
        //TODO: add in your layers and everything else in here
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