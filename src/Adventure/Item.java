package Adventure;

public class Item {

  private final String langtNavn;
  private final String navn;
  

  Item(String kortNavn, String langtNavn) {
    this.navn = kortNavn;
    this.langtNavn = langtNavn;
  }

  public String getLangtNavn() {
    return langtNavn;
  }

  public String getNavn() {
    return navn;
  }
}

