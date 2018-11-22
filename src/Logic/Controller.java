package Logic;

import Data.User;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt & Simon
 * Kristopher Kruse Bentzen.
 */
public interface Controller {

    /**
     *
     * @param ID
     * @param name
     * @param birthdate
     * @param phonenumber
     * @param email
     * @param elite
     * @param active
     * @param coach
     * @param memberSince
     * @param discipline
     */
    public void opretBruger(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);

    /**
     *
     * @return
     */
    public ArrayList<User> readMemberList();

    /**
     *
     * @param ID
     */
    public void sletBruger(int ID);

    /**
     *
     * @return
     */
    public int readID();

    /**
     *
     * @param ID
     */
    public void writeID(int ID);

    /**
     *
     * @param ID
     * @return
     */
    public User søgBruger(int ID);

    /**
     *
     */
    public void redigerBruger();

    /**
     *
     * @param birthDate
     * @param currentDate
     * @return
     */
    public int calculateAge(LocalDate birthDate, LocalDate currentDate);

    /**
     *
     * @param age
     * @param active
     * @return
     */
    public double priceCalculator(int age, boolean active);

    /**
     *
     * @param ID
     * @param name
     * @param birthdate
     * @param phonenumber
     * @param email
     * @param elite
     * @param active
     * @param coach
     * @param memberSince
     * @param discipline
     */
    public void opretRestance(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);

    /**
     *
     * @return
     */
    public ArrayList<User> readRestance();

    /**
     *
     * @param ID
     */
    public void sletRestance(int ID);

    public void juniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);

    public ArrayList<User> juniorReadTeams();
    
    public void juniorHoldOprettelse(ArrayList<User> teams);
    
    public void seniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);
    
    public ArrayList<User> seniorReadTeams();
    
    public void seniorHoldOprettelse(ArrayList<User> teams);
}
