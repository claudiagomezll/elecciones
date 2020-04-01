
/**
 * Write a description of class Candidato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Candidato
{
    private String nombre;
    private String documento;
    private String email;
    private String telefono;
    private String genero;
    private Partido partido;
    
    public Candidato()
    {
        
    }
    
    public Candidato(String nombre, String documento, String email, String telefono, String genero, Partido p)
    {
        this.nombre=nombre;
        this.documento=documento;
        this.email=email;
        this.telefono=telefono;
        this.genero=genero;
        this.partido=p;
       
            
    }
   
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad documento*/
    public String getDocumento(){
        return this.documento;
    }//end method getDocumento

    /**Metodo de modificación a la propiedad documento*/
    public void setDocumento(String documento){
        this.documento = documento;
    }//end method setDocumento

    /**Metodo de acceso a la propiedad email*/
    public String getEmail(){
        return this.email;
    }//end method getEmail

    /**Metodo de modificación a la propiedad email*/
    public void setEmail(String email){
        this.email = email;
    }//end method setEmail

    /**Metodo de acceso a la propiedad telefono*/
    public String getTelefono(){
        return this.telefono;
    }//end method getTelefono

    /**Metodo de modificación a la propiedad telefono*/
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }//end method setTelefono

    /**Metodo de acceso a la propiedad genero*/
    public String getGenero(){
        return this.genero;
    }//end method getGenero

    /**Metodo de modificación a la propiedad genero*/
    public void setGenero(String genero){
        this.genero = genero;
    }//end method setGenero

    /**Metodo de acceso a la propiedad partido*/
    public Partido getPartido(){
        return this.partido;
    }//end method getPartido

    /**Metodo de modificación a la propiedad partido*/
    public void setPartido(Partido partido){
        this.partido = partido;
    }//end method setPartido


    abstract public  void registrarVoto();
    
    

   abstract public Float calcularPorcentajeVotos();
    
}