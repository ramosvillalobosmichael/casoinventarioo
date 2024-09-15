/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoinventario;

/**
 *
 * @author zegar
 */
public class clasificaiondeproductos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tipo1=1;
        String mensajeCat1 = "";
        
        mensajeCat1 = switch (tipo1) {
            case 1 -> "Producto electronico. Revisar garantia.";
            case 2 -> "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 -> "Producto de ropa. Revisar tallas disponibles.";
            default -> "Categoria no valida.";
        };
    }
    

    }
    

