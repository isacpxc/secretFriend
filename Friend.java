public class Friend {
  private String name;
  private String email;
  private String emailSecretFriend;

  private Friend(String friend, String eFriend){
    this.name = friend;
    this.emailSecretFriend = eFriend;
  }

  public void setEmailSecretFriend(String emailSecretFriend) {
    this.emailSecretFriend = emailSecretFriend;
  }

  public String getEmailSecretFriend() {
    return emailSecretFriend;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
