public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Business b = new Business("John","fyheehwefhwefe@gmail.com");
        Regular a = new Regular("Joe",374298427);
        b.contact();
        a.contact();
    }
}


abstract class Contacts {
    private String name;

    public Contacts(String name) {
        this.name = name;
    }
    abstract void contact();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





class Business extends Contacts{
  private String email;

    public Business(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    void contact() {
        System.out.println(this.email);
    }
}

class Regular extends Contacts{
    private int pnumber;

    public Regular(String name, int pnumber) {
        super(name);
        this.pnumber = pnumber;
    }

    @Override
    void contact() {
        System.out.println(pnumber);
    }
}
