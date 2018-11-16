
package Logic;

import Data.User;
import Data.DataHandling;
import Data.Filehandling;
import java.util.ArrayList;
public class ControllerImpl implements Controller {

//    private ArrayList<User> list = new ArrayList<>();
    private Filehandling f = new Filehandling();
    private final DataHandling d;

    public ControllerImpl(DataHandling d) {
        this.d = d;
    }

    @Override
    public void opretBruger(int ID, String name, String birthdate, String phonenumber, 
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline) {
        User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline);
        if (user.isElite()) {
            user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline);
        } else {
            user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, null);
        }
        d.addUser(user);
        f.writeObject(d.getMembers());
    }


    @Override
    public void sletBruger(int ID) {
        for (int i = 0; i < d.getMembers().size(); i++) {
            Object get = d.getMembers().get(i).getID();
            if (d.getMembers().get(i).getID() == ID) {
                d.getMembers().remove(i);
                break;
            }
        }
        f.writeObject(d.getMembers());
    }

    @Override
    public ArrayList<User> readMemberList() {
       return f.readObject();
    }
}
