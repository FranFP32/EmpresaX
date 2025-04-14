package Personas;

public class suscriptor extends personas {
    private String email;
    private int telefono;

    public suscriptor(String nombre, String apellido, int edad, String email, int telefono) {
        super(nombre, apellido, edad);
        this.email = email;
        this.telefono = telefono;
    }
    public suscriptor() {

    }
    public String getEmail() {
        return email;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n email='" + email + '\'' +
                "\n telefono=" + telefono ;
    }
}
