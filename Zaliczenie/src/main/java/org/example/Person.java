package org.example;

public class Person {
    private String name;
    private String address;

    /**
     * Zapisuje imie i adress
     * @param name
     * @param address
     */
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
}

