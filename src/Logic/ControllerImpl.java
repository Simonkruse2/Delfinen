
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
    public void opretBruger() {

        if (user.isElite()) {
            user = new User(user.getID(), user.getName(), user.getBirthdate(), user.getPhonenumber(), 
                   user.getEmail(), user.isElite(), user.isActive(), user.isCoach(),user.getMemberSince(), user.getDiscipline());
        } else {
            user = new User(user.getID(), user.getName(), user.getBirthdate(), user.getPhonenumber(), 
                   user.getEmail(), user.isElite(), user.isActive(), user.isCoach(),user.getMemberSince(), null);
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

    @Override
    public ArrayList<User> memberList() {
        ArrayList<User> list = new ArrayList<>();
        for(int i = 0; i < f.readObject().size(); i++){
            list.add(f.readObject().get(i));
        }
        return list;
    }
}
