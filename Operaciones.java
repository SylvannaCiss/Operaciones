import javax.swing.JOptionPane;
public class Operaciones{
    public static void main(String[]args){

        String numero1 = JOptionPane.showInputDialog("Ingresa un numero");
        double numeroDecimal1 = Double.parseDouble(numero1);

        String numero2 = JOptionPane.showInputDialog("Ingresa otro numero");
        double numeroDecimal2 = Double.parseDouble(numero2);

        double division = numeroDecimal1/numeroDecimal2;
        System.out.println("La division es: "+division);

        double suma = numeroDecimal1+numeroDecimal2;
        System.out.println("La suma es: "+suma);

        double resta = numeroDecimal1-numeroDecimal2;
        System.out.println("La resta es: "+resta);

        double multiplicacion = numeroDecimal1*numeroDecimal2;
        System.out.println("La multiplicacion es: "+multiplicacion);
    
       
    }
} 




