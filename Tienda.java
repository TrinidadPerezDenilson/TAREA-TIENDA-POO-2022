package Tienda;

public class Tienda {

    private String nombre;

    private String direccion;

    private Cliente clientes[];

    private int index = 0;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
    public void addCliente(Cliente cliente) {
        this.clientes[this.index++ ]= cliente;
    }

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new Cliente[9];
    }

    public void ordenarCodigo() {

        Cliente aux;

        for (int i = 0; i < 9 - 1; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (clientes[i].getCodigo() > clientes[j].getCodigo()) {
                    aux = clientes[i];
                    clientes[i] = clientes[j];
                    clientes[j] = aux;
                }
            }
        }
        System.out.println("--------mostrando clientes ordenados-------");
        for (int i = 0; i < 9; i++) {
            System.out.println(" "+ clientes[i].getCodigo() + " " + clientes[i].getNombre() + " " + clientes[i].getApellidos() + " " + clientes[i].getDni());
        }
    }
}