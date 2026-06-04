Patrón: Observador

Contexto:
Un monitor del tipo de cambio del dólar notifica automáticamente a un
generador de gráficos cada vez que se detecta una variación relevante
en el valor del dólar, permitiendo actualizar la representación visual
del mercado para facilitar el análisis de inversiones.

Clases principales:
- MonitorTipoCambio: Subject concreto. Mantiene el valor del dólar
  y notifica a los observadores registrados ante cada cambio.
- TipoCambioObserver: Observer abstracto. Define el contrato update()
  y mantiene referencia al subject.
- GeneradorGraficosObserver: Observer concreto. Implementa update()
  mostrando por consola el nuevo valor del dólar.
- AppTipoCambio: Clase principal. Crea el subject y el observer,
  y simula varios cambios en el valor del dólar.

Compilación y ejecución (desde la carpeta src/):
  javac *.java
  java AppTipoCambio
