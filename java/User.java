public class User {
  //Probably will be used every time
  private String firstName;
  private String lastName;
  private String username;
  //Other optional ones
  private int age;
  private List<User> friends;
  public User(String f, String l, String u) {
    firstName = f;
    lastName = l;
    username = u;
  }
}
