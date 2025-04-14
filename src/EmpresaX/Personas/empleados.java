package Personas;

public class empleados extends personas{
    private double salario;
    private enum sucursal{
        sucursales
    };
    private String dni;

    public empleados(String nombre, String apellido, int edad, double salario,String dni) {
        super(nombre, apellido, edad);
        this.salario = salario;
        this.dni = dni;
    }
    public empleados(){

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Salario=" + salario +
                "\n DNI='" + dni;
    }
}

