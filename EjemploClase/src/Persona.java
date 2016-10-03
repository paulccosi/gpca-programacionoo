/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Persona {
   public String nombre;
   private int edad;
   protected String direccion;
   
   String dormir(){
       
       return "Duerme a las 9:30 pm";
   }
   
   String dormir(String hora){
       
       return "Duerme a las"+hora;
   }
   
   String comer(){
       
       return nombre+ "come un plato Paseño";
   }
   
   void comer (String x){
       System.out.println("Come un plato"+x);
   }
           
}
