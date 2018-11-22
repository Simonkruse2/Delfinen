package Logic;

import Data.User;
import Data.DataHandling;
import Data.Filehandling;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 * 
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt & Simon Kristopher Kruse Bentzen.
 */

public class ControllerImpl implements Controller {

    private Filehandling f = new Filehandling();
    private final DataHandling d;

    /**
     *
     * @param d
     */
    public ControllerImpl(DataHandling d) {
        this.d = d;
    }

    /**
     *Opretter en burger ud fra .....
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
    @Override
    public void opretBruger(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline) {
        int age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
        double price = priceCalculator(age, active);
        User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price);
        d.addUser(user);
        f.writeObject(d.getMembers());
    }

    /**
     *
     * @param ID
     */
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

    /**
     *
     * @return
     */
    @Override
    public ArrayList<User> readMemberList() {
        return f.readObject();
    }

    /**
     *
     * @return
     */
    @Override
    public int readID() {
        return f.readWithBufferedReader();
    }

    /**
     *
     * @param ID
     */
    @Override
    public void writeID(int ID) {
        f.writeWithBufferedWriter(ID);
    }

    /**
     *
     * @param ID
     * @return
     */
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

    /**
     *
     */
    @Override
    public void redigerBruger() {
        for (int i = 0; i < d.getMembers().size(); i++) {
            f.writeObject(d.getMembers());
        }
    }

    /**
     *
     * @param birthDate
     * @param currentDate
     * @return
     */
    @Override
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    /**
     *
     * @param age
     * @param active
     * @return
     */
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
     * @param elite
     * @param active
     * @param coach
     * @param memberSince
     * @param discipline
     */
    @Override
    public void opretRestance(int ID, String name, String birthdate, String phonenumber, String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline) {
        {
            int age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
            double price = priceCalculator(age, active);
            User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price);
            d.addUserRestance(user);
            f.writeObjectRestance(d.getRestance());
        }
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<User> readRestance() {
        return f.readObjectRestance();
    }

    /**
     *
     * @param ID
     */
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
    public void juniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber, String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline) {
        {
            int age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
            double price = priceCalculator(age, active);
            User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price);
            d.addUserJuniorTeam(user);
            f.juniorWriteObjectTeams(d.getUserJuniorTeam());
        }
    }

    @Override
    public ArrayList<User> juniorReadTeams() {
        return f.juniorReadObjectTeams();
    }
    @Override
    public void juniorHoldOprettelse(ArrayList<User> juniorTeam) {
        int juniorAge = 18;
        for (int i = 0; i < d.getMembers().size(); i++) {
            if (d.getMembers().get(i).getAge() < juniorAge && d.getMembers().get(i).isElite() == true) {
                juniorTeam.add(d.getMembers().get(i));
            }
        }
        f.juniorWriteObjectTeams(juniorTeam);
    }
    @Override
    public void seniorOpretUserTeam(int ID, String name, String birthdate, String phonenumber, String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline) {
    {
            int age = calculateAge(LocalDate.parse(birthdate), LocalDate.now());
            double price = priceCalculator(age, active);
            User user = new User(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, age, price);
            d.addUserJuniorTeam(user);
            f.seniorWriteObjectTeams(d.getUserJuniorTeam());
        }
    }

    @Override
    public ArrayList<User> seniorReadTeams() {
        return f.seniorReadObjectTeams();
    }

    @Override
    public void seniorHoldOprettelse(ArrayList<User> seniorTeam) {
        int seniorAge = 18;
        for (int i = 0; i < d.getMembers().size(); i++) {
            if (d.getMembers().get(i).getAge() < seniorAge && d.getMembers().get(i).isElite() == true) {
                seniorTeam.add(d.getMembers().get(i));
            }
        }
        f.seniorWriteObjectTeams(seniorTeam);
    }

}
