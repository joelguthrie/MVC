/**
 * Created by Joel on 3/1/2017.
 */
public class model {

    private String hobbit;

    public void compareName(String hobbit){
        if(hobbit == "Frodo"){
            System.out.println("Hobbit full name is Frodo Baggins");
        }
        else if (hobbit == "Sam"){
            System.out.println("Hobbit full name is Samwise Gamgee");
        }
        else if (hobbit == "Merry"){
            System.out.println("Hobbit full name is Meridock Gamgee");
        }
        else {
            System.out.println("Hobbit full name is Perrigrin Took");
        }
    }

    public String getName(){
        return hobbit;
    }
}
