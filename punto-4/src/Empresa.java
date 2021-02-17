/**
 * Objeto empresa
 * Hereda de la clase Usuario los atributos en común
 */
public class Empresa extends Usuario {

    //Atributos
    private String sector;
    private String descripcion;
    private int annioFundacion;
    private int cantidadEmpleados;

    //Método constructor
    public Empresa(String nombre, long dni, String direccion, long telefono, String correo, String sector, String descripcion, int annioFundacion, int cantidadEmpleados) {
        super(nombre, dni, direccion, telefono, correo);
        this.sector = sector;
        this.descripcion = descripcion;
        this.annioFundacion = annioFundacion;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    //Métodos get y set
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnnioFundacion() {
        return annioFundacion;
    }

    public void setAnnioFundacion(int annioFundacion) {
        this.annioFundacion = annioFundacion;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro Empresa");
        sb.append("\n Nombre: ");
        sb.append(getNombre());
        sb.append("\n DNI: ");
        sb.append(getDni());
        sb.append("\n Dirección: ");
        sb.append(getDireccion());
        sb.append("\n Teléfono: ");
        sb.append(getTelefono());
        sb.append("\n Correo: ");
        sb.append(getCorreo());
        sb.append("\n Sector: ");
        sb.append(getSector());
        sb.append("\n Descripción: ");
        sb.append(getDescripcion());
        sb.append("\n Año de fundación: ");
        sb.append(getAnnioFundacion());
        sb.append("\n No. Empleados: ");
        sb.append(getCantidadEmpleados());
        sb.append("\n-----------------------\n");
        return sb.toString();
    }
}
