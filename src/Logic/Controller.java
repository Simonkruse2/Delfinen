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
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, double time);

    public ArrayList<User> readMemberList();

    public void sletBruger(int ID);

    public int readID();

    public void writeID(int ID);

    public User søgBruger(int ID);

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
     * @param elite - Motionist vs konkurrencesvømmer.
     * @param active - Aktivt eller passivt medlemskab.
     * @param coach - træner eller ej.
     * @param memberSince - Medlem siden dags dato for oprettelsen. Sættes efter
     * LocalDate.now()
     * @param discipline - Svømmedisciplin.
     * @param time - Swimmingtime.
     */
    public void opretRestance(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, double time);

    public ArrayList<User> readRestance();

    public void sletRestance(int ID);

    public void juniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, int age, double price, double time);

    public ArrayList<User> juniorReadTeams();

    public void seniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, int age, double price, double time);

    public ArrayList<User> seniorReadTeams();

}
