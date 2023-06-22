package org.example;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Bierze te osobe i zapisuje do jakiej szkoly chodzil i ile musi zaplacic
     * @param name
     * @param address
     * @param school
     * @param pay
     */
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.pay=pay;
        this.school=school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [school=" + school + ", pay=" + pay + super.toString() + "]";
    }
}
