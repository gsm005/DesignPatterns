public class NullUserDetails extends UserDetails {

    public NullUserDetails() {
        super("N/A", "N/A", "N/A",true);
    }

    @Override
    public void displayDetails() {
        System.out.println("No user details available.");
    }
    
}
