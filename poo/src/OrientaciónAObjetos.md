# Programación orientada a objetos

Los objetos son entidades que contienen métodos y atributos. Siempre
son identificables y únicos.

Es un paradigma de programación, 
una manera de programar específica, donde se organiza el código en unidades 
denominadas clases, de las cuales se crean objetos que se relacionan entre sí 
para conseguir los objetivos de las aplicaciones.

## La clase
La clase es un molde, de como será la entidad(objeto), que queremos
crear, primero debemos diseñar este molde.

La clase debe estar siempre escrita en mayúscula la primera letra
y si es compuesta se separa por mayúscula también, está antecedido
por la palabra clave class:
````java
public class AutomovilDeportivo{
    //Atributos
    String modelo;
    //Métodos
    public void acelerar(){
        
    }
}
````
Es recomendable escribir un diseño o diagrama UML(Unified 
Modeling Language), antes de escribir nuestro código.

### Crear objetos
El operador new reserva memoria dinámica para un objeto 
creándose de la siguiente manera:
````java
public class AutomovilDeportivo{
    Automovil auto = new Automovil();
}
````