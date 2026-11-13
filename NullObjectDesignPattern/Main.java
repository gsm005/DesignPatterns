public class Main {

    public static void main(String[] args){
        UserDetails existingUser = findUserById(1);
        existingUser.displayDetails();

        UserDetails missingUser = findUserById(2);
        missingUser.displayDetails();
    }

    private static UserDetails findUserById(int id) {
        if (id == 1) {
            return new UserDetailsImpl("Asha", "asha@example.com", "0123456789");
        }
        return new NullUserDetails();
    }
}
