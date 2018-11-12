
package delfinen;

import java.util.ArrayList;

public class User {
 
   private String navn;
   private String email;
   private String phonenumber;
   private String ID;
   private ArrayList<User> yearsPaid = new ArrayList<>();
   private int birthdate;
   private int memberSince;
   private boolean admin;
   private boolean cashier;
   private boolean coach;
   private boolean active;
   private boolean elite;

    public User(String navn, String email, String phonenumber, String ID, int birthdate, int memberSince) {
        this.navn = navn;
        this.email = email;
        this.phonenumber = phonenumber;
        this.ID = ID;
        this.birthdate = birthdate;
        this.memberSince = memberSince;
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

    public ArrayList<User> getYearsPaid() {
        return yearsPaid;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public int getMemberSince() {
        return memberSince;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isCashier() {
        return cashier;
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