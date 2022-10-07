package Tienda;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Compu.chex" ,"Av.Tito Jaime");
        tienda.addCliente(new Cliente(3,"Juan","Alvarez",71306521));
        tienda.addCliente(new Cliente(2,"Pedro","Zeballos",71306522));
        tienda.addCliente(new Cliente(5,"Luis","Trinidad",71306523));
        tienda.addCliente(new Cliente(9,"Arnold","Aquino",71306524));
        tienda.addCliente(new Cliente(7,"Pepe","Cotrina",71306525));
        tienda.addCliente(new Cliente(1,"Carlos","Chavez",71306526));
        tienda.addCliente(new Cliente(4,"Maria","Stela",71306527));
        tienda.addCliente(new Cliente(8,"Luz","Rojas",71306528));
        tienda.addCliente(new Cliente(6,"Nayely","Penadillo",71306529));

        System.out.println(tienda.getNombre() +" "+ tienda.getDireccion());

        for (Cliente cliente : tienda.getClientes()) {
            System.out.println(cliente.getCodigo() +" "+ cliente.getNombre() +" "+ cliente.getApellidos() +" "+ cliente.getDni());
        }
        tienda.ordenarCodigo();
    }
}