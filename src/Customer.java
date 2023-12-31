public class Customer {
    private String name;
    private String address;
    private int age;

    public Customer() {

    }

    public Customer(String name, String address, int age) {
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

    public void showInformation() {
        System.out.println(getName());
        System.out.println(getAdrress());
    }
}
