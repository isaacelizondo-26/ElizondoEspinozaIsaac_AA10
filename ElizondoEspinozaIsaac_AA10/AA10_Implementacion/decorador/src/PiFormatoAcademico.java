public class PiFormatoAcademico extends DecoradorPi {

  public PiFormatoAcademico(IPi piOriginal) {
    super(piOriginal);
  }

  @Override
  public String generarValor() {
    return piOriginal.generarValor()
        + " | Formato académico: π ≈ 3.141592653589793";
  }
}
