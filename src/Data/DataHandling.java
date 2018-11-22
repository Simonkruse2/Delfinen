package Data;

import java.util.ArrayList;

/**
 * 
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt, Simon Kristopher Kruse Bentzen.
 */
public class DataHandling {

    private ArrayList<User> members = new ArrayList<>();
    private ArrayList<User> restance = new ArrayList<>();
    private ArrayList<User> juniorTeam = new ArrayList<>();
    private ArrayList<User> seniorTeam = new ArrayList<>();
    private int id;

    
    public DataHandling() {
        Filehandling f = new Filehandling();
        id = f.readWithBufferedReader();
        members = f.readObject();
        restance = f.readObjectRestance();
        juniorTeam = f.juniorReadObjectTeams();
        seniorTeam = f.seniorReadObjectTeams();
    }

    /**
     * Adds user to members ArrayList.
     *
     * @param user - member in the club. Coach is included as a user.
     */
    public void addUser(User user) {
        members.add(user);
    }

    /**
     * Removes user from members ArrayList.
     *
     * @param user - member in the club. Coach is included as a user.
     */
    public void removeUser(User user) {
        members.remove(user);
    }

    /**
     * Returns the members ArrayList.
     *
     * @return members as a ArrayList of User.
     */
    public ArrayList<User> getMembers() {
        return members;
    }

    /**
     * Returns the restance ArrayList.
     *
     * @return ArrayList of users with outstanding payments.
     */
    public ArrayList<User> getRestance() {
        return restance;
    }

    /**
     * Returns the members ArrayList.
     *
     * @param user - adds user with outstanding payment to ArrayList.
     */
    public void addUserRestance(User user) {
        restance.add(user);
    }

    /**
     * Returns the members ArrayList.
     *
     * @param user - adds user with outstanding payment to ArrayList.
     */
    public void removeUserRestance(User user) {
        restance.remove(user);
    }

    public void addUserJuniorTeam(User user){
        juniorTeam.add(user);
    }
    
    public void removeUserJuniorTeam(User user){
        juniorTeam.remove(user);
    }
    
    public ArrayList<User> getUserJuniorTeam(){
        return juniorTeam;
    }
    
        public void addUserSeniorTeam(User user){
        seniorTeam.add(user);
    }
    
    public void removeUserSeniorTeam(User user){
        seniorTeam.remove(user);
    }
    
    public ArrayList<User> getUserSeniorTeam(){
        return seniorTeam;
    }
    /** 
     * 
     * @return ID of a specific user.
     */
    public int addID() {
        return id;
    }
}
