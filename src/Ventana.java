import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Ventana {
    private JPanel Ventanita;
    private JTabbedPane tabbedPane1;
    private JComboBox cboComida;
    private JTextField txtCodigo;
    private JTextField txtPrecio;
    private JButton btnAgregar;
    private JButton btnModificar;
    private JButton btnBuscar;
    private JButton btnEliminar;
    private JTextArea txtTexto;
    private JTextArea textBuscar;
    private JTextField txtCodigoBuscar;
    Pila pila = new Pila();
    public Ventana() {

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Todo lo de abajo sirve para guardar lo que escribe el usuario
                String nombre = cboComida.getSelectedItem().toString();
                String codigo = txtCodigo.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                //Esto guarda la lista
                Productos p = new Productos(nombre, codigo, precio);
                //Mensajito
                JOptionPane.showMessageDialog(null,"Se añadio un nuevo producto");
                pila.insertar(p);
                //Las funciones estan iguales
                actualizarLista();
                limpiar();
                //Esto imprime todo
                txtTexto.setText(pila.listarTodosLosElementos());
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Guarda el codigo
                String codigo = txtCodigoBuscar.getText();
                Stack<Productos> encontrar = pila.buscarCodigo(codigo);
                //Esto imprime lo encontrado
                textBuscar.setText(String.valueOf(encontrar));

            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Bueno esto es un try catch, creo que ya sabes que pdo xd
                try {
                    String eliminar = pila.removerElemento().toString();
                    JOptionPane.showMessageDialog(null, "Se elimino con exito" + eliminar);
                    txtTexto.setText(pila.listarTodosLosElementos());
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
                }
            }
        });
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtPrecio.setText("");
    }

    public void actualizarLista() {
        txtTexto.setText(pila.toString());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventanita);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
