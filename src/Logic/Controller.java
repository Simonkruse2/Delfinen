package Logic;

import Data.User;
import java.util.ArrayList;

public interface Controller {

    public void opretBruger();
 
    public ArrayList<User> readMemberList();
    
    public void sletBruger(int ID);
}
