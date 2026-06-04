import java.util.ArrayList;

public class MonitorTipoCambio {

  private double valorActualDolar;
  private ArrayList<TipoCambioObserver> observers;

  public MonitorTipoCambio() {
    this.observers = new ArrayList<>();
  }

  public double getValorActualDolar() {
    return valorActualDolar;
  }

  public void setValorActualDolar(double valorActualDolar) {
    this.valorActualDolar = valorActualDolar;
    notifyAllObservers();
  }

  public void attach(TipoCambioObserver observer) {
    observers.add(observer);
  }

  public void notifyAllObservers() {
    for (TipoCambioObserver observer : observers) {
      observer.update();
    }
  }
}
