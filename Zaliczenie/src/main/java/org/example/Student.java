package org.example;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Tutaj zapisuje informacje o studencie takie jak: Imię, adres, na jaki kierunek chodzi, ile lat, i jaki koszt do zapłacenia jest
     * @param name
     * @param address
     * @param program
     * @param year
     * @param fee
     */
    public Student(String name, String address, String program, int year, double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [" +super.toString() + ", " +"program=" + program + ", year=" + year + ", fees=" + fee + "]";
    }
}
