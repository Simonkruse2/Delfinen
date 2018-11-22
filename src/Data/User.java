package Data;

import java.io.Serializable;


/**
 * 
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt & Simon Kristopher Kruse Bentzen.
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
            String email, boolean elite, boolean active, boolean coach, String memberSince, String discipline, int age, double price) {
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
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param discipline
     */
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     *
     * @return
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public boolean isActive() {
        return active;
    }

    /**
     *
     * @return
     */
    public boolean isElite() {
        return elite;
    }

    /**
     *
     * @return
     */
    public boolean isCoach() {
        return coach;
    }

    /**
     *
     * @return
     */
    public String getMemberSince() {
        return memberSince;
    }

    /**
     *
     * @return
     */
    public String getDiscipline() {
        return discipline;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param birthdate
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     *
     * @param phonenumber
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     *
     * @param elite
     */
    public void setElite(boolean elite) {
        this.elite = elite;
    }

    /**
     *
     * @param coach
     */
    public void setCoach(boolean coach) {
        this.coach = coach;
    }

    /**
     *
     * @param memberSince
     */
    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

}
