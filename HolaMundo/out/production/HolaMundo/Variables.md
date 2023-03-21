# Variables
Las variables son entidades que contienen datos o valores
## Categorias
Existen 2 categorias:
* Primitivas: Tipos simples, solo contienen valor
* Referencia: Es mas complejo, representan una entidad completa

## Reglas para definir una variable:
* Por convención inicia con minuscula.
* No puede tener caracteres especiales, ni iniciar con numero.
* No puede ser una palabra reservada
* No deben tener el mismo nombre de otra variable.
* Las palabras se colocan juntas y se separan por mayusculas.
* Pueden comenzar con una letra, un simbolo dolar, guion bajo.

# Tipos de variables primitivas:
### boolean
Es el tipo mas simple de un solo bit, puede ser true o false, su valor por defecto es false.

```java
boolean a = true;
boolean b = false;
```
### char
Ocupa 16 bits, representa un solo caracter, basandose en la tabla unicode, su valor por defecto es u0000 (null).
```java
char a = 'a';
char c = '\u20021';
```
### PrimitivosEnteros enteros
Son 4 tipos, byte(8 bits), short (16 bites), int (32 bits) y long(64 bits).
```java
//entre -128 a 127
byte enteroByte = 127;

//entre -32768 a 32767
short enteroShort = 32767;

//entre 2147483648 a 2147483648
int enteroInt = 2147483648;

//entre -9223372036854775808 a 9223372036854775808 
// se debe especificar la L al final
long enteroLong = 9223372036854775808L;
```
### PrimitivosEnteros numeros reales
Son el float y el double:
```java
//Precision simple
float realFloat = 3.1416f; //Debe llevar una f al final

//Precision doble
double realDouble = 4.7029235E3;
```
