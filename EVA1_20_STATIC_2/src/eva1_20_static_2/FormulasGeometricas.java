/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_static_2;

/**
 *
 * @author hp
 */
public class FormulasGeometricas {
    
   public static final double PI=3.14159;
    
    
    //area, perimetro, volumen
    
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    
    public static double areaCirculo(double radio){
        return PI *radio*radio;
    }
    
    public static double perimetroCirculo(double radio){
        return PI*(radio*2);
        
    }
    
    public static double volumenEsfera(double radio){
        return (4.0/3.0)*PI*(radio*radio*radio);
    }
}