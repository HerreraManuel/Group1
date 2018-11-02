import javax.swing.*;

public class Dashboard extends JFrame {

    private JFrame window;
    private JPanel leftside;
    private JPanel rightside;
    boolean initialized;

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
}