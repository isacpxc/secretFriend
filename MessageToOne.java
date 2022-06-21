public class MessageToOne extends Message{
  private String destinyEmail;

  public MessageToOne(String text, String emailSender, String destinyEmail, Boolean anonymous){
    super(text,emailSender,anonymous);
    this.destinyEmail = destinyEmail;

    };


  @Override // notation to warn the compiler that this is overriding something, if we change the name, will crash
  public String getCompleteTextToView(){
    return "";
  }

}
