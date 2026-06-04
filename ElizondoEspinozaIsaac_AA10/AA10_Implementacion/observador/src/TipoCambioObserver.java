public abstract class TipoCambioObserver {

  protected MonitorTipoCambio subject;

  public TipoCambioObserver(MonitorTipoCambio subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  public abstract void update();
}
