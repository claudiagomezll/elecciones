
/**
 * Write a description of class Senado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Senado extends Candidato
{
    Integer numero;
    static Integer votos=0;
    private Integer voto=0;
 
   
    public Senado()
    {
        
       super();
    }

   
    public Senado(String nombre, String documento, String email, String telefono, String genero, Partido partido, Integer numero)
    {  
        super(nombre, documento, email, telefono, genero,partido);
        this.numero=numero;
    }
    
    //get an set
    
    public Integer getNumero(){
     return this.numero;
    }
    
      
           

    /**Metodo de modificación a la propiedad numero*/
    public void setNumero(Integer numero){
        this.numero = numero;
    }//end method setNumero

    /**Metodo de acceso a la propiedad votos*/
    public Integer getVotos(){
        return this.votos;
    }//end method getVotos

    /**Metodo de modificación a la propiedad votos*/
    public void setVotos(Integer votos){
        this.votos = votos;
    }//end method setVotos

    /**Metodo de acceso a la propiedad voto*/
    public Integer getVoto(){
        return this.voto;
    }//end method getVoto

    /**Metodo de modificación a la propiedad voto*/
    public void setVoto(Integer voto){
        this.voto = voto;
    }//end method setVoto

    
    
 //metodos analizadores
   public void validarNumero()
    {
        if (this.numero >=1 && this.numero <=100){
    
        System.out.println("El numéro corresponde a la lista del senado");}
        else 
           { System.out.println("El numéro no corresponde a la lista del senado");}
        
    
    }
    
  @Override
    public void registrarVoto()
    {
        voto++;
        votos++;
       
       }
    
    @Override
    public Float calcularPorcentajeVotos(){
    
        return (float) 100*this.voto/this.votos;
    
    
    }
   
    
    public void imprimirDatos()
    {
        System.out.println("El partido político del candidato al senado es:"+this.getPartido().getNombre());
        System.out.println("El nombre del candidato al senado es:"+getNombre());
        System.out.println("El documento del candidato al senado es: "+getDocumento());
        System.out.println("El email del candidato al senado es: "+getEmail());
        System.out.println("El numero del candidato al senado es: "+getNumero());
        System.out.println("El numero de votos del candidato al senado es: "+voto);
    }
}