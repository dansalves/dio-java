public class SmartTV {
  boolean ligada=false;
  int canal=0;
  int volume=0;

  public void ligarDesligar() {
    ligada=!ligada;
  }
  public void aumentarVolume() {
    volume++;
  }
  public void diminuirVolume() {
    volume--;
  }
  public void trocarCanal(int canal)
  canal = canal;
}