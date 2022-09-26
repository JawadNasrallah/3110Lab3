public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo myName = new BuddyInfo("Jawad", "236 Kiwanis", "4323");
        System.out.println("Hello" + myName.getName());

    }
}
