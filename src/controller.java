import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Joel on 3/1/2017.
 */
public class controller {
    private view theView;
    private model theModel;

    public controller(view theView, model theModel){
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addNameListener(new NameListener());
    }
    class NameListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String hobbit = "";
            try{
                hobbit = theView.getName();

                theModel.compareName(hobbit);
                theView.setName(theModel.getName());
                            }
            catch (NumberFormatException ex){
                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter a correct name");

            }

        }
    }
}
