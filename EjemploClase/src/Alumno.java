/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Alumno {
    String carrera;
    String codigo;
    
    String estudia(String lugar){
        
        return "";
    }
    
    
    
    public static void main(String [] obj){
    System.out.println("Hola");
   
    //variable de tipo persona
    //Persona objPersona;
    Persona objPersona=new Persona();
    objPersona.nombre="Paul ";
    //objPersona.ed="Paul "; //No es pósible porque es privado
    objPersona.direccion="Paul ";//Es de tipo protected
    
    
    System.out.println(objPersona.comer());
   
    
    
    }
    
}
