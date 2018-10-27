
package Negocio.entidad;



public class Usuario {
     private String Usuario; 
    private String pass;
    private String nombre;
    private String apellido;
   private String correo;
   
   public Usuario(){
       
}

   
    
   public Usuario(String Usuario, String pass, String nombre, String apellido, String correo) {
        this.Usuario = Usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
