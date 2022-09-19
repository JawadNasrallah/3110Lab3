import java.util.ArrayList;

 public class AddressBook {

     ArrayList<BuddyInfo> x = new ArrayList<>();

     public void addBuddy(BuddyInfo newContact) {
         x.add(newContact);
     }

     public void removeBuddy(BuddyInfo newContactx) {
         x.add(newContactx);
     }

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        BuddyInfo newContact = new BuddyInfo("Jawad", "236 Kiwanis", "6132617875");
        ab.removeBuddy(newContact);
        ab.addBuddy(newContact);
        System.out.println("Address Book");

    }


}
