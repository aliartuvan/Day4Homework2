package entites.users.concreates;

import java.time.LocalDate;

public class Gamer extends User{

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationaltyId;

    public Gamer(int id, String nickName, String password, String firstName,
                 String lastName, LocalDate dateOfBirth, String nationaltyId) {
        super(id, nickName, password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setNationaltyId(nationaltyId);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationaltyId() {
        return nationaltyId;
    }

    public void setNationaltyId(String nationaltyId) {
        this.nationaltyId = nationaltyId;
    }
}
