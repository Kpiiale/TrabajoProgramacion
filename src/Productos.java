public class Productos {

    private String nombre;
    private String codigo;
    private double precio;
    public Productos (String nombre,String codigo,Double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   //Le hice mas chido al toString :3
    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                " Codigo: " + codigo +
                " Precio:" + precio+ "\n";
    }
}


//tipos: ferreteria(Naomi), alimentos(Mateo), limpieza(Richie), papeleria(Guille, Emilio)
//botones: agregar, buscar por codigo, editar, eliminar


