package Tienda;

public class Cliente {

    private Integer codigo;
    private String nombre;
    private String apellidos;
    private Integer dni;

    public Integer getCodigo() {return codigo;}

    public void setCodigo(Integer codigo) {this.codigo = codigo;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Cliente(Integer codigo, String nombre, String apellidos, Integer dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
}
