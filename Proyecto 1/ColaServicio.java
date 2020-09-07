package Proyecto1;

import java.util.Scanner;

public class ColaServicio {
    private Nodo raiz, cima;
    private static Scanner sc;

    public void enqueue(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (raiz == null) {
            raiz = nuevo;
            cima = nuevo;
        } else {
            cima.siguiente = nuevo;
            cima = nuevo;
        }
    }

    public int dequeue() {
        if (raiz == null) {
            return -1;
        }
        int aux = raiz.elemento;
        if (raiz == cima) {
            raiz = null;
            cima = null;
        } else {
            raiz = raiz.siguiente;
        }
        return aux;
    }

    public void listarCola() {
        Nodo tmp = raiz;
        if (tmp == null) {
            System.out.println("La cola esta vacia");
        } else {
            while (tmp != null) {
                System.out.println(tmp.elemento);
                tmp = tmp.siguiente;
            }
        }
    }

    public void vaciarCola() {
        if (raiz == null) {
            System.out.println("La cola esta vacia");
            return;
        }
        while (raiz != null) {
            raiz = raiz.siguiente;
        }
    }

    public static void main(String[] args) {
        ColaServicio c = new ColaServicio();
        sc = new Scanner(System.in);
        int salir = 0, elemento, opcion;
        while (salir == 0) {
            System.out.println("1 .... ENQUEUE");
            System.out.println("2 .... DEQUEUE");
            System.out.println("3 .... Listar");
            System.out.println("4 .... Vaciar");
            System.out.println("0 .... Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero: ");
                    elemento = sc.nextInt();
                    c.enqueue(elemento);
                    break;
                case 2:
                    elemento = c.dequeue();
                    if (elemento == -1) {
                        System.out.println("La cola esta vacia");
                    } else {
                        System.out.println("Valor eliminado de la cola: " + elemento);
                    }
                    break;
                case 3:
                    c.listarCola();
                    break;
                case 4:
                    c.vaciarCola();
                    break;
                default:
                    if (opcion == 0) {
                        salir = 1;
                        System.out.println("Bye xD");
                    }
                    break;
            }
        }
    }
}

