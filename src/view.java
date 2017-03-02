import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Joel on 3/1/2017.
 */
public class view extends JFrame{
    private JTextField name = new JTextField(15);
    private JLabel intro = new JLabel("Enter hobbit name; Frodo, Sam, Merry, or Pippin");
    private JButton changeName = new JButton("Find full name");
    private JTextField fullName = new JTextField(25);

    view(){
        JPanel hobbit = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        hobbit.add(name);
        hobbit.add(intro);
        hobbit.add(changeName);
        hobbit.add(fullName);

        this.add(hobbit);
    }
    public String getName(){
        return name.getText();

    }

    public String fullName(){
        return fullName.getText();

    }
    public void setName(String name){
        fullName.setText(name);
    }

    void addNameListener(ActionListener listenerForNameButton){
        changeName.addActionListener(listenerForNameButton);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
