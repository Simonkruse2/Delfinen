package Logic;

import Data.User;
import java.util.ArrayList;

public interface Controller {

    public void opretBruger(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);

    public ArrayList<User> readMemberList();

    public void sletBruger(int ID);
    
    public ArrayList<User> memberList();
}
