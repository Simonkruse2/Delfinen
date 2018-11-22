package Data;

import java.util.ArrayList;

public class DataHandling {

    private ArrayList<User> members = new ArrayList<>();
    private ArrayList<User> restance = new ArrayList<>();
    private int id;

    public DataHandling() {
        Filehandling f = new Filehandling();
        id = f.readWithBufferedReader();
        members = f.readObject();
        restance = f.readObjectRestance();
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
    
    public ArrayList<User> getRestance(){
        return restance;
    }
    public void addUserRestance(User user){
        restance.add(user);
    }
    
    public void removeUserRestance(User user){
        restance.remove(user);
    }
    
    public int addID() {
        return id;
    }
}
