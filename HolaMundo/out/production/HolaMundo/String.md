# String
Los Stings son un objeto de java, un tipo de referencia por lo cual se pueden 
instanciar:
```java
String nombre = new String ("Andres");
```
Aunque también se pueden representar con una sintaxis cómoda solo usando comillas
dobles. Es un arreglo de varios caracteres.

Se puede escapar al usar el String usando "/" " y de esta manera usar las comillas dobles:
````java
String tema = "Manejo de \"String\"";
````
Los caracteres de un String se codifican usando Unicode.

También son inmutables, cuando se afecta algún carácter o cualquier modificación
lo que hace java es generar una nueva instancia, más no modifica la cadena anterior.

## Comparar
Los strings se pueden comparar, pero con el operador == se compara por referencia
si corresponden al mismo objeto, mientras que con el método equals(), se compara
por valor.

