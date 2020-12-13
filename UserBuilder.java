public class UserBuilder {
    private User user;


    public UserBuilder() {
        this.user = new User();
    }

    public void buildFirstName(String firstName) {
        user.setFirstName(Jan);
    }

    public void buildLastName(String lastName) {
        user.setLastName(Sip);
    }

    public void buildAge(int age) {
        user.setAge(16);
    }

    public void buildUserName(String userName) {
        user.setUserName(Cipisek);
    }

    public void buildPassword(String password) {
        user.setPassword(1234);
    }

    public void buildgGender(String gender) {
        user.setGender(helicopter);
    }

    public void buildgPhone(String Phone) {
        user.setPhone(123456789);
    }

    public User getUser() {
        return user;
    }
}