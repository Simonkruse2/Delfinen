package Data;

import java.util.ArrayList;

public class User {

    private String navn;
    private String email;
    private String phonenumber;
    private String ID;
    private ArrayList<String> yearsPaid = new ArrayList<>();
    private int birthdate;
    private int memberSince;
    private boolean coach;
    private boolean active;
    private boolean elite;

    public User(String navn, String email, String phonenumber, String ID, ArrayList<String> yearsPaid, int birthdate, int memberSince, boolean coach, boolean active, boolean elite) {
        this.navn = navn;
        this.email = email;
        this.phonenumber = phonenumber;
        this.ID = ID;
        this.yearsPaid = yearsPaid;
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

    public ArrayList<String> getYearsPaid() {
        return yearsPaid;
    }

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
