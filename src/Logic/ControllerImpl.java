
package Logic;

import Data.User;
import Data.DataHandling;
import Data.Filehandling;
import java.util.ArrayList;
public class ControllerImpl implements Controller {

    private ArrayList<User> list = new ArrayList<>();
    private DataHandling d = new DataHandling();
    private Filehandling f = new Filehandling();
    private User user;
    @Override
    public void opretBruger(int ID, String name, String birthdate, String phonenumber, 
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline) {
        this.user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline);
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
        for (int i = 0; i < list.size(); i++) {
            Object get = list.get(i).getID();
            if (list.get(i).getID() == ID) {
                list.remove(i);
            }
            f.writeObject(list);
        }
    }

    @Override
    public ArrayList<User> readMemberList() {
       return f.readObject();
    }
}
