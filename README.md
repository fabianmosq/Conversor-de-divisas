# Conversor-de-divisas
challenge alura
Hola, lamento la informalidad para este documento.

BREVE EXPLICACIÓN DE CÓMO FUNCIONA (O DEBERÍA FUNCIONAR) ESTE PROYECTO:

  La mayoría de conversiones de unidades físicas y monetarias son de tipo lineal, esto quiere decir que si algo vale cero
  en una unidad valdrá cero en la otra y los cambios siempre serán proporcionales, quiere decir:
  
  x: factor
  
  A, B: el valor
  
  u1, u2: la unidad 
  
  x*A u1 ­­­:= X*B u2 => ejemplo: 2*1 pulg := 2* 2.54 cm
  
  Con esta primicia todas las conversiones de unidades que respondan a lo anterior; no son más que una regla de tres o una
  multiplicacion de relación de equivalentes.
  
  A u1  * (B u2 / A u1) = B u2 => ejemplo: 1 pulg * (2.54 cm / 1 pulg) = 2.54 cm
  
  entonces (B u2 / A u1) sería una relación (r), donde r = "El valor que queremos obtener"/"El valor que queremos trasformar"

COMO FUNCIONA EL CÓDIGO:

Para arrancar el código se debe correr como proyecto desde el archivo src/util/Principal.java quien es el que contiene el ‘main'.
proyecto se divide en 3 ‘package’ util, gui y CuadrosWind:

'util' contienen las clases que como se contienen y se hacen los cálculos.

'gui' contiene las clases que "hacen" las ventanas ventanas para ingresar los datos
.
'CuadrosWind' contiene los diferentes tipos de unidades y sus respectivos valores equivalentes.

NOTA:
Ya que se trabajó con librerías para hacer ventanas y cajas de texto, estás no están limitadas a solo valores numéricos.
Se intentó trabajar con listas separadas por coma, pero al final se trabajó con arreglos (arrays).





