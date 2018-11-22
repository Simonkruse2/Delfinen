package Data;

import java.io.Serializable;

/**
 *
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt & Simon
 * Kristopher Kruse Bentzen.
 */
public class User implements Serializable {

    private int ID;
    private String name;
    private String birthdate;
    private String phonenumber;
    private String email;
    private boolean elite;
    private boolean active;
    private boolean coach;
    private String memberSince;
    private String discipline;
    private int age;
    private double price;
    private double time = 0.0;

    @Override
    public String toString() {
        return ID + "," + name + "," + birthdate
                + "," + phonenumber + "," + email + "," + memberSince
                + "," + elite + "," + coach + "," + active + age + price + "\n";
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
     * @param age
     * @param price
     */
    public User(int ID, String name, String birthdate, String phonenumber,
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, int age, double price, double time) {
        this.ID = ID;
        this.name = name;
        this.birthdate = birthdate;
        this.phonenumber = phonenumber;
        this.email = email;
        this.elite = elite;
        this.active = active;
        this.coach = coach;
        this.memberSince = memberSince;
        this.discipline = discipline;
        this.age = age;
        this.price = price;
        this.time = time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isElite() {
        return elite;
    }

    public boolean isCoach() {
        return coach;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setElite(boolean elite) {
        this.elite = elite;
    }

    public void setCoach(boolean coach) {
        this.coach = coach;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

}
