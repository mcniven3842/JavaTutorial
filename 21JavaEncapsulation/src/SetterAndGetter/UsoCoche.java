package SetterAndGetter;

public class UsoCoche {
    public static void main(String[] Args){
        
       Coche Renault = new Coche(); //Instanciar una clase
       //llama al metodo getter
       System.out.println(Renault.dime_largo());
       
       //se definira con el metodo setter el color del coche
       Renault.establece_color("amarillo");
       //ahora usa metodo getter para averiguar color
       System.out.println(Renault.dime_color());
                 
    
    }
    
}