package Data;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private String navn;
    private String email;
    private String phonenumber;
    private String ID;
   // private ArrayList<String> yearsPaid = new ArrayList<>();
    private int birthdate;
    private int memberSince;
    private boolean coach;
    private boolean active;
    private boolean elite;

    @Override
    public String toString() {
        return   navn + "," + email + "," + phonenumber
                 + "," + ID + "," + birthdate + "," + memberSince
                 + "," + coach + "," + active + "," + elite + "," + "\n";
    }


    
    public User(String navn, String email, String phonenumber, String ID, int birthdate, int memberSince, boolean coach, boolean active, boolean elite) {
        this.navn = navn;
        this.email = email;
        this.phonenumber = phonenumber;
        this.ID = ID;
   //     this.yearsPaid = yearsPaid;
        this.birthdate = birthdate;
        this.memberSince = memberSince;
        this.coach = coach;
        this.active = active;
        this.elite = elite;
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getID() {
        return ID;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public void setMemberSince(int memberSince) {
        this.memberSince = memberSince;
    }

    public void setCoach(boolean coach) {
        this.coach = coach;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setElite(boolean elite) {
        this.elite = elite;
    }

//    public ArrayList<String> getYearsPaid() {
//        return yearsPaid;
//    }

    public int getBirthdate() {
        return birthdate;
    }

    public int getMemberSince() {
        return memberSince;
    }

    public boolean isCoach() {
        return coach;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isElite() {
        return elite;
    }

}
