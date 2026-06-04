public class AppPi {

  public static void main(String[] args) {
    System.out.println("=== Demostración del patrón Decorador con Pi ===");

    IPi piBasico = new PiBasico();
    System.out.println("Pi básico:");
    System.out.println(piBasico.generarValor());

    System.out.println();

    IPi piConNotacion = new PiNotacionCientifica(piBasico);
    System.out.println("Pi con notación científica:");
    System.out.println(piConNotacion.generarValor());

    System.out.println();

    IPi piDecorado = new PiFormatoEspecializado(
        new PiFormatoAcademico(
            new PiNotacionCientifica(
                new PiBasico())));
    System.out.println("Pi con decoradores encadenados:");
    System.out.println(piDecorado.generarValor());
  }
}
