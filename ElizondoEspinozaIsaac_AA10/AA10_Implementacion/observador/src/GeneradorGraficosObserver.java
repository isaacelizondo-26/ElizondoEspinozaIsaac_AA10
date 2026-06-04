public class GeneradorGraficosObserver extends TipoCambioObserver {

  public GeneradorGraficosObserver(MonitorTipoCambio subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println(
        "Gráfico actualizado con el nuevo valor del dólar: "
            + subject.getValorActualDolar());
  }
}
