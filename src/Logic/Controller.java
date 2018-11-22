package Logic;

import Data.User;
import java.time.LocalDate;
import java.util.ArrayList;

public interface Controller {

    public void opretBruger(int ID, String name, String birthdate, String phonenumber, 
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);
 
    public ArrayList<User> readMemberList();
    
    public void sletBruger(int ID);
    
    public int readID();
    public void writeID(int ID);
    public User søgBruger(int ID);
    public void redigerBruger();
    public int calculateAge(LocalDate birthDate, LocalDate currentDate);
    public double priceCalculator(int age, boolean active);
    public void opretRestance(int ID, String name, String birthdate, String phonenumber, 
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline);
    public ArrayList<User> readRestance();
    public void sletRestance(int ID);
}
