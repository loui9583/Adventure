package Adventure;

public class Item {

  private String navn;
  private final String langtNavn;


  Item(String kortNavn, String langtNavn) {
    this.navn = kortNavn;
    this.langtNavn = langtNavn;
  }

  public String getNavn() {
    return navn;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }

  /*public void setLangtNavn(String langtNavn) {
    this.langtNavn = langtNavn;
  }*/
  public String getLangtNavn() {
    return langtNavn;
  }


}

