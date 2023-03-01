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
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  final int x;
        x = 100;
        x = 200;*/
      final int x;
        
        FormulasGeometricas for1=new FormulasGeometricas();
        
        x=20;
//        x=131;
        
        System.out.println("Pi: "+FormulasGeometricas.PI);
        System.out.println("area triangulo: "+FormulasGeometricas.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: "+FormulasGeometricas.volumenEsfera(10.0));
    }
    
}
