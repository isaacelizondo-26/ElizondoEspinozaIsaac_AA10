Patrón: Decorador

Contexto:
Una aplicación de cálculo matemático presenta el valor de π en distintos
formatos de representación. En lugar de modificar la clase base o crear
subclases combinadas, el patrón Decorador permite envolver el objeto
original y agregar nuevas formas de presentación de forma independiente
y encadenable.

Clases principales:
- IPi: Interfaz componente. Define el contrato generarValor().
- PiBasico: Componente concreto. Devuelve la representación básica de π.
- DecoradorPi: Decorador abstracto. Mantiene referencia al objeto IPi
  decorado.
- PiNotacionCientifica: Decorador concreto. Agrega notación científica.
- PiFormatoAcademico: Decorador concreto. Agrega formato académico.
- PiFormatoEspecializado: Decorador concreto. Agrega formato para
  estudios matemáticos.
- AppPi: Clase principal. Demuestra el uso individual y encadenado
  de los decoradores.

Compilación y ejecución (desde la carpeta src/):
  javac *.java
  java AppPi
