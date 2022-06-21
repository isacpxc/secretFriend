public class MessageToAll extends Message {
  public MessageToAll(String texto, String email, Boolean anonymous){
    super(texto, email, anonymous);
  } 

  @Override
  public String getCompleteTextToView(){
    return "";
  }
}
