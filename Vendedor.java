
package ec.edu.espol.model;
import java.util.ArrayList;

public class Vendedor extends Registrar{
    private ArrayList<String> sistema;
    
    public Vendedor(String nombres,String apellidos,String organizacion,String correoelectronico,String clave){
        super(nombres,apellidos,organizacion,correoelectronico,clave);
      
        for(String c: sistema){
            if(c.equals(correoelectronico)){
                System.out.println("El correo electronico ya esta en el sistema");
                break;
            
            }
            
            else {
                this.sistema.add(correoelectronico);
            
            }                     
        }
    }
 
    
    
     
    
    
}
