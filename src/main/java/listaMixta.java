import java.util.ArrayList;

class ListaMixta {
    private ArrayList<Object> elementos;

    public ListaMixta() {
        elementos = new ArrayList<Object>();
    }

    public void agregarElemento(Object elemento) {
        elementos.add(elemento);
    }

    public void imprimirLista() {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        ListaMixta lista = new ListaMixta();
        lista.agregarElemento(1);
        lista.agregarElemento("Hola");
        lista.agregarElemento(new Persona("Diego","Ruiz", 40));
        lista.imprimirLista();
    }
}
