# Operadores
Java brinda muchos tipos de operadores que se pueden usar 
según la necesidad y se clasifican según su funcionalidad:

## Aritméticos
Se utiliza para realizar operaciones aritméticas simples en 
tipos de datos primitivos como: +, -, %, /, *, etc.
### Combinados:
Se usan combinados o compuestos como: -=, +=, /=, *= .

## Incremento y Decremento
Utilizado para incrementar o decrementar el valor en 1, hay 
dos variedades el pre y el post:
- ++a: incrementa en 1 y luego devuelve a.
- a++: Devuelve a y luego incrementa en 1.
- --a
- a--
````java
int a = 1;
//En este primer caso, a valdra 2 y b valdra 2.
int v = ++a;
a = 1;
//En este segundo caso a valdra 2 pero b valdra 1.
b = a++;
````
Se pueden colocar tanto antes como después de la expresión que deseemos
modificar pero sólo devuelve el valor modificado si esta adelante.

## Ternario o condicional
Es una versión abreviada de la sentencia if-else, tiene 3 operandos y de
ahi el nombre de Ternario.
(condición?)valor1:valor2
Si la condición se cumple devuelve el primer valor y si no el 2.
````java
int a = 2 > 3? 1:2;
````

## Relacionales
Se utilizan para comprobar relaciones de igualdad, devuelven un resultado booleano:
< <= > >= == !=

## Lógicos
Permiten evaluar expresiones lógicas y trabajan con operandos booleanos
Realizan las operaciones lógicas de conjunción (AND), disyunción (OR)
y negación (NOT):

Condicionales:
- AND = &&
- OR = ||
- NOT = !

Siempre evalúa ambas operandos
- AND = &
- OR = |
- XOr = ^ Verdadero cuando A y B son diferentes. Es nivel de bits (1 o 0).

## Precedencia de los operadores:
Jerarquía:
1. ++ -- + - !
2. ()
3. / * %
4. +-
5. < <= => >
6.  == !=
7. &&
8. ||
9. ()?
10. = += -= *= /= %=