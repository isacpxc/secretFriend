public abstract class Message { // abstract because we don't want to create an instance od Message
  private String text;
  private String senderEmail;
  private Boolean anounymous;

  public Message(String text, String senderEmail, Boolean anounymous){
    this.text = text;
    this.senderEmail = senderEmail;
    this.anounymous = anounymous;
  }

  public void setText(String text) {
    this.text = text;
    
  }

  public String getText() {
    return text;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public String getSenderEmail() {
    return senderEmail;
  }

  public Boolean isAnonymous(){
    return true;
  }

  public abstract String getCompleteTextToView(); // forces classes that inherit this to override, ps:. if the class that inherit this is abstract too, don't need to override
  // An abstract method will be override just in the first concrete class inherit

}
