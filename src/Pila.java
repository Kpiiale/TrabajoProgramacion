import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Pila {

    private Stack<Productos> productos; //private ArrayList<Productos> productos; Esto es una lista, no una pila
    public Pila(){
        productos=new Stack<>(); //Por ende tambien cambia esto
    }
//Aqui decidi mejor quitar esta funcion y reemplazarla por otra mas abajo, si quieres predefinir me avisas
   /* public void push(Productos producto) {
        Pila pilaProductos = new Pila();

        pilaProductos.push(new Productos("Leche", "001", 0.12));
        pilaProductos.push(new Productos("Pan", "0025", 0.80));
        pilaProductos.push(new Productos("Queso", "1617", 2.50));
        productos.add(producto);
    }*/
    //Le cambie de push a insertar
   public void insertar(Productos elementoNuevo){ //Esta es la nueva de insertar elemento
       productos.push(elementoNuevo);
   }
   //Mas facil con un for y se va listando en orden :3
    public String listarTodosLosElementos(){
        String resultado= "";
        for(int i=productos.size()-1; i>=0;i--){
            resultado+=productos.get(i).toString();
        }
        return resultado;
    }
//Le cambie de pop a removerElemento
    public Productos removerElemento() throws Exception{
        if (productos.isEmpty()) {
            throw new Exception("Pila sin elementos"); //Agregue esta mensaje porque x, mas facil xd
        }
        //Esto solo le quite porque no sabia si funcionaria asi y es un poco ineficiente pero si quieres pruebale
        /*return productos.remove(productos.size() - 1);*/
        return productos.pop();
    }

//Me avisas si quieres agregar eso xd
    public Productos peek() {
        if (productos.isEmpty()) {
            throw new EmptyStackException();
        }
        return productos.get(productos.size() - 1);
    }
// No entiendo esta funcion para que sirve pero wueno xdddd
    public boolean isEmpty() {
        return productos.isEmpty();
    }
//  No entiendo esta funcion para que sirve pero wueno X2
    public int size() {
        return productos.size();
    }
    //Agregue esta cosa para buscar por codigo, pero tambien esta peek osea para ver la cima. Me avisas si quieres agregar eso
    public Stack<Productos> buscarCodigo(String codigo){
        Stack<Productos> busqueda = new Stack<>();
        for(Productos p:productos){
            if(p.getCodigo().contains(codigo)){
                busqueda.add(p);

            }
        }return busqueda;
    }
//Esta hueva es lista literalmente, en pila no se usa eso JAJAJAJAJAJAJ
    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Productos producto : productos) {
            sb.append(producto.toString()).append("\n");
        }
        return sb.toString();
    }*/
}



