public abstract class DecoradorPi implements IPi {

  protected IPi piOriginal;

  public DecoradorPi(IPi piOriginal) {
    this.piOriginal = piOriginal;
  }
}
