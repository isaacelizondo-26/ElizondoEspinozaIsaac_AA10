public class PiFormatoEspecializado extends DecoradorPi {

  public PiFormatoEspecializado(IPi piOriginal) {
    super(piOriginal);
  }

  @Override
  public String generarValor() {
    return piOriginal.generarValor()
        + " | Formato especializado para estudios matemáticos";
  }
}
