package ed.dci;

public class ListaEnlazada {
    // variables miembro de la clase Lista Enlazada
    Nodo cabeza = null;
    Nodo cola = null;

    /*
     *  Método que permite agregar un elemento
     *  al frente de la Lista Enlazada
     */
    public void agregarFrente(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        if ( cola == null ){
            cabeza = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
        }
        cola = nuevoNodo;
    }

    /*
     *  Método que permite agregar un elemento
     *  al final la Lista Enlazada
     */
    public void agregarFinal(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        // Lista vacía
        if ( cola == null ){
            cabeza = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
        }
        cola = nuevoNodo;
    }



    /*
     *  Método que permite agregar un elemento
     *  en un índice específico de la Lista Enlazada
     */
    public void agregarEnIndice(int index, int valor) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if ( index == 0) { // agregar en la cabeza
            agregarFrente(valor);
        } else {
                Nodo nuevoNodo = new Nodo(valor);
                Nodo actual = cabeza;
                for ( int i = 0; i < index - 1; i++ ){
                    if ( actual == null ) {
                        throw new IndexOutOfBoundsException();
                    }
                    actual = actual.siguiente;
                }
                if ( actual.siguiente == null ) { //añadir al final
                    cola = nuevoNodo;
                } else {
                    nuevoNodo.siguiente = actual.siguiente;
                    actual.siguiente = nuevoNodo;
                }
            }
        }
    /*
     *  Método que permite imprimir los elementos
     *  de la Lista Enlazada
     *  Formato de salida: [1,2,3] o []
     */
    public void imprimirLista(ListaEnlazada nombreLista){
        String cadena="";
        if(nombreLista==null){
            cadena="lista vacia";
        }else{
            Nodo contador=cabeza;
            while(contador!=null){
                System.out.println("["+contador+"]");
                contador=contador.siguiente;
            }
        }
    }

    public static void main(String[] args) {

    }
}
