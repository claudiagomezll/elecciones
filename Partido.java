
/**
 * Write a description of class Partido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Partido
{
    private String nombre;
    private String creacion;
  
    public Partido()
    {
       
    }

   public Partido(String nombre,String creacion)
    {
    this.nombre=nombre;
    this.creacion=creacion;
    }
    
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad creacion*/
    public String getCreacion(){
        return this.creacion;
    }//end method getCreacion

    /**Metodo de modificación a la propiedad creacion*/
    public void setCreacion(String creacion){
        this.creacion = creacion;
    }//end method setCreacion

}