public class User {
    private String username;
    private String user_id;

    public User(String username, String user_id) {
        this.username = username;
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
