
/**
 * Write a description of class Departamento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Departamento
{
    String nombre;
    Integer curul;
    
    public Departamento()
    {
        
    }

    public Departamento(String nombre, Integer curul)
    {
        this.nombre=nombre; 
        this.curul=curul;
    }
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad curul*/
    public Integer getCurul(){
        return this.curul;
    }//end method getCurul

    /**Metodo de modificación a la propiedad curul*/
    public void setCurul(Integer curul){
        this.curul = curul;
    }//end method setCurul

}