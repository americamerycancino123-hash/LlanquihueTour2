package cl.duoc.llanquihuetour.model;

public class Tour {

    private String nombre;
    private String apellido;
    private String cargo;
    private String telefono;
    private String ciudad;

    public Tour(){
    }
    public Tour(String nombre, String apellido, String cargo, String telefono, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }
    public String getNombre(){
        return nombre;
        }
    public void setNombre(String nombre){
        if (nombre == null || nombre. isBlank()){
            throw  new IllegalArgumentException("El nombre del tour no puede estar vacio");
        }
        this.nombre = nombre. trim();
    }
    public String getApellido(){
        return apellido;
    }
        public void setApellido(String apellido){
        if (apellido == null || apellido. isBlank()){
            throw  new IllegalArgumentException(" El apellido del tour no puede estar vacio");
        }
        this.apellido = apellido.trim();
    }
    public String getCargo (){
        return  cargo;
    }
    public void setCargo(String cargo){
        if (cargo == null || cargo. isBlank()){
        throw  new IllegalArgumentException("El cargo del tour no puede estar vacio");
    }
        this.cargo = cargo.trim();
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono=" + telefono +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
