import javax.swing.JOptionPane;

public class helloNameDialog {
    public static void main(String[] args) {
        String result = JOptionPane.showInputDialog("please enter ur name:");
        JOptionPane.showInputDialog(null, "hello " + result);
    }
}
