package baitap4;

import java.time.LocalDate;

public class Child {
    private String fullName;
    private LocalDate dateOfBirth;

    public Child(String fullName, LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
