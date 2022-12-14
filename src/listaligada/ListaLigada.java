/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

/**
 *
 * @author Estudiante
 */
public class ListaLigada<T> {
    private Nodo head; //la cabecera de la lista (el primer nodo)
    private Nodo tail; //la copla de la lista (del ultimo nodo)
    private Nodo actual; //el nodo actual
    private int size; // el tamaño de la lista (numero de nodods)
 
    
public ListaLigada(){
       // inicializamos todo a null poruqe no se han creado nododos
    this.head = null;
    this.actual = null;
    this.tail = null;
    this.size = 0;
}
/*
 public void addFirst(int dato){
     Nodo nodo = new Nodo(dato);
     this.head = nodo;
     this.tail = nodo;
     this.actual = nodo;
     this.size++;
 }*/

 public void add(T dato){
     Nodo nuevoNodo = new Nodo(dato);
     this.size++;
 
    if (head == null) {//La lista está vacía, creamos el primer nodo
        head = nuevoNodo;
        actual = head;
        tail = nuevoNodo;//se mueve el apuntador al último nodo
    }
    else{
        tail.setSiguiente(nuevoNodo);//actual.sig apunta al nuevoNodo (enlace entre nodos)
        tail = nuevoNodo;// ahora actual es el nuevoNodo
    }
}
 
 public void add(int dato, int posicion){
     Nodo nuevoNodo = new Nodo(dato);
     int i = 1;
     actual = head;
     while(i < posicion - 1){
         actual = actual.getSiguiente();
         i++;
     }
     Nodo auxiliar = actual.getSiguiente();
     actual.setSiguiente(nuevoNodo);
     actual = nuevoNodo;
     actual.setSiguiente(auxiliar);
 }
 
 
 public void printList(){
     int posicion = 1;
     actual = head;
     while(actual != null){
         T elemento = (T) actual.getDato();
         System.out.println("Dato = " + elemento + " almacenado en nodo: " + posicion);
         actual = actual.getSiguiente();
         posicion++;
     }
 }
    
}
