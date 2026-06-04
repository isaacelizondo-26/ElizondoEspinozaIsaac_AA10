public class PiNotacionCientifica extends DecoradorPi {

  public PiNotacionCientifica(IPi piOriginal) {
    super(piOriginal);
  }

  @Override
  public String generarValor() {
    return piOriginal.generarValor()
        + " | Notación científica: 3.141592653589793 x 10^0";
  }
}
