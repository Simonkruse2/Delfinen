package Data;

import java.util.ArrayList;

public class DataHandling {

    private ArrayList<User> members = new ArrayList<>();
    private int id;

    public DataHandling() {
        Filehandling f = new Filehandling();
        id = f.readWithBufferedReader();
        members = f.readObject();
    }

    public void addUser(User user) {
        members.add(user);
    }

    public void removeUser(User user) {
        members.remove(user);
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public int addID() {
        return id;
    }
}
