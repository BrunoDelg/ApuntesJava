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

### Comparar
Los strings se pueden comparar, pero con el operador == se compara por referencia
si corresponden al mismo objeto, mientras que con el método equals(), se compara
por valor.
````java
String str1 = "Hola andres";
        String str2 = new String("Hola andres");

        System.out.println(str1 == str2);//Da false
        System.out.println(str1.equals(str2));//Da true
````
## Métodos importantes
- int length(): nos da el número de caracteres.
- boolean equals(String b): Compara si ambas son iguales por valor.
- boolean equalsIgnoreCase: Compara si ambas son iguales por valor 
independientemente de mayúsculas o minúsculas.
- int compareTo(String b): Compara contra la cadena de argumento, devolviendo:
- - Un valor negativo si la cadena es anterior a b.
- - Cero si la cadena es igual a b.
- - Un valor positivo si la cadena es posterior a b.
-  String trim(): Crea un nuevo objeto eliminando los espacios en blanco que pudiera
haber al principio o al final
- char charARt(int posición): Extrae un carácter en la posición indicada.
- char[] toCharArray(): Convierte la cadena en un arreglo de caracteres.
- String substring(int a, int b): Extrae la sub-cadena entre a y b.
- String substring(int desde): Extrae la sub-cadena desde la posición indicada.
- int indexOf(String cadena): Indica en qué posición se encuentra el carácter (o cadena)
indicado por primera vez, buscando desde el principio.
- int lastIndexOf(String cadena): Indica en qué posición se encuentra el carácter (o cadena)
  indicado por primera vez, buscando desde el final.
- boolean startsWith(String prefijo): Dice si la cadena comienza con el prefijo indicado.
- boolean endsWith(String sufijo): Dice si la cadena termina con el sufijo indicado.
- String[] split(String patron): Divide la cadena en varias sub-cadenas utilizando
el patrón indicado como separador.

