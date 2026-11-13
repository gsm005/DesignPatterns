public class UserDetailsImpl extends UserDetails {

    public UserDetailsImpl(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber,false);
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
    
}
