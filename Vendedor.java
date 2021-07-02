
package ec.edu.espol.model;
import java.util.ArrayList;

public class Vendedor extends Registrar{
    private ArrayList<String> sistema;
    
    public Vendedor(String nombres,String apellidos,String organizacion,String correoelectronico,String clave){
        super(nombres,apellidos,organizacion,correoelectronico,clave);
      
        for(String c: sistema){
            if(c.equals(correoelectronico)){
                System.out.println("El usuario ya esta en el ");
                break;
            
            }
            
            else {
                this.sistema.add(correoelectronico);
            
            }                     
        }
    }
    
    public String validarcorreo(){
        for(String c: sistema){
            if(c.equals(this.correoelectronico)){
                
            
            }
            
            else {
                this.sistema.add(correoelectronico);
            
            }   
        }
    }
    
    
    
    
    
    
}
