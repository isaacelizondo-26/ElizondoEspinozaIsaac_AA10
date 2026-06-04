public class AppTipoCambio {

  public static void main(String[] args) {
    MonitorTipoCambio monitor = new MonitorTipoCambio();
    new GeneradorGraficosObserver(monitor);

    System.out.println("=== Simulación de cambios en el valor del dólar ===");

    monitor.setValorActualDolar(500.25);
    monitor.setValorActualDolar(512.80);
    monitor.setValorActualDolar(498.60);
    monitor.setValorActualDolar(530.00);
  }
}
