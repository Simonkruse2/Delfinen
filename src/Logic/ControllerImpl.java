package Logic;

import Data.User;
import Data.DataHandling;
import Data.Filehandling;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt & Simon
 * Kristopher Kruse Bentzen.
 */
public class ControllerImpl implements Controller {

    private Filehandling f = new Filehandling();
    private final DataHandling d;


    public ControllerImpl(DataHandling d) {
        this.d = d;
    }

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
     * @param memberSince - Medlem siden dags dato for oprettelsen. Sættes efter LocalDate.now()
     * @param discipline - Svømmedisciplin.
     */
    @Override
    public void opretBruger(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, double time) {
        int age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
        double price = priceCalculator(age, active);
        User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price, time);
        d.addUser(user);
        f.writeObject(d.getMembers());
    }

    @Override
    public void sletBruger(int ID) {
        for (int i = 0; i < d.getMembers().size(); i++) {
            if (d.getMembers().get(i).getID() == ID) {
                d.getMembers().remove(i);
                break;
            }
            f.writeObject(d.getMembers());
        }

    }


    @Override
    public ArrayList<User> readMemberList() {
        return f.readObject();
    }

    @Override
    public int readID() {
        return f.readWithBufferedReader();
    }


    @Override
    public void writeID(int ID) {
        f.writeWithBufferedWriter(ID);
    }

    @Override
    public User søgBruger(int ID) {
        User user = null;
        for (int i = 0; i < d.getMembers().size(); i++) {
            if (d.getMembers().get(i).getID() == ID) {
                user = d.getMembers().get(i);
                break;
            }
        }
        return user;
    }

    @Override
    public void redigerBruger() {
        for (int i = 0; i < d.getMembers().size(); i++) {
            f.writeObject(d.getMembers());
        }
    }


    @Override
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public double priceCalculator(int age, boolean active) {
        double price = 0;
        if (!active) {
            price = 500;
            return price;
        }
        if (age < 18) {
            price = 1000;
        }
        if (age >= 18) {
            price = 1600;
        }
        if (age >= 60) {
            price = 1600 * 0.75;
        }
        return price;
    }

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
     * @param memberSince - Medlem siden dags dato for oprettelsen. Sættes efter LocalDate.now()
     * @param discipline - Svømmedisciplin.
     */
    @Override
    public void opretRestance(int ID, String name, String birthdate, String phonenumber, String email, boolean elite,
            boolean active, boolean coach, String memberSince, String discipline, double time) {
        {
            int age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
            double price = priceCalculator(age, active);
            User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price, time);
            d.addUserRestance(user);
            f.writeObjectRestance(d.getRestance());
        }
    }

    @Override
    public ArrayList<User> readRestance() {
        return f.readObjectRestance();
    }

    @Override
    public void sletRestance(int ID) {

        for (int i = 0; i < d.getRestance().size(); i++) {
            if (d.getRestance().get(i).getID() == ID) {
                d.getRestance().remove(i);
                break;
            }
            f.writeObjectRestance(d.getRestance());
        }

    }

    @Override
    public void juniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber, String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, int age, double price, double time) {
        {
            age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
            if (age < 18 && elite == true) {
                price = priceCalculator(age, active);
                User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price, time);
                d.addUserJuniorTeam(user);
                f.juniorWriteObjectTeams(d.getUserJuniorTeam());
            }
        }
    }

    @Override
    public ArrayList<User> juniorReadTeams() {
        return f.juniorReadObjectTeams();
    }

    @Override
    public void seniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber, String email, boolean elite,
            boolean active, boolean coach, String memberSince, String discipline, int age, double price, double time) {
        {
            age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
            if (age >= 18 && elite == true) {
                price = priceCalculator(age, active);
                User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price, time);
                d.addUserSeniorTeam(user);
                f.seniorWriteObjectTeams(d.getUserSeniorTeam());
            }
        }
    }

    @Override
    public ArrayList<User> seniorReadTeams() {
        return f.seniorReadObjectTeams();
    }

}
