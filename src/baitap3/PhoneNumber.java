package baitap3;

import java.util.ArrayList;

class PhoneNumber {
    String name;
    ArrayList<String> phone;

    public PhoneNumber(String name, String phoneNumber) {
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phoneNumber);
    }

    public String toString() {
        return name + ": " + phone;
    }
}
