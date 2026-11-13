public abstract class UserDetails {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private boolean isNull;

    public UserDetails(String name, String email, String phoneNumber,boolean isNull) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isNull = isNull;
    }

    protected String getName() {
        return name;
    }

    protected String getEmail() {
        return email;
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }
    protected boolean isNull() {
        return isNull;
    }

    public abstract void displayDetails();

}
