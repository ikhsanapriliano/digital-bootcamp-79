
// Created By : Ikhsan Apriliano Hidayat
// Created At : 12 December 2023

public class Reviewer {
    private String name;
    private String address;
    private int age;

    public Reviewer() {

    }

    public Reviewer(String name, String address, int age) {
        super();
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
