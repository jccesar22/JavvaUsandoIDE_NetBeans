
package programa;

import java.util.Scanner;

public class Programa {

    
    public static void main(String[] args) {
       float a, b, c;      //coeficientes
            double  delta,        //delta
              sqrtdelta,    //raiz quadrada de delta
              x1,x2;  //raízes
        Scanner entrada = new Scanner(System.in);
        
        //Passo 1: Recebendo os coeficientes
        System.out.println("Equação do 2o grau: ax² + bx + cx = 0");
        System.out.print("Entre com o valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Entre com o valor de b: ");
        b = entrada.nextFloat();
        System.out.print("Entre com o valor de c: ");
        c = entrada.nextFloat();
        
        //Passo 2: Checando se a equação é válida
        if(a != 0){
        
        //Passo 3: recebendo o valor de delta e calculando sua raiz quadrada
            delta = (Math.pow(b,2) - a*c*4);
            sqrtdelta = Math.sqrt(delta);
            System.out.println("esse e o delta  " + sqrtdelta);
        
        //Passo 4: se a raiz de delta for maior que 0, as raízes são reais    
            if(delta > 0){
                x1 = ((-1)*b + sqrtdelta)/(2*a);
                x2 = ((-1)*b - sqrtdelta)/(2*a);
                System.out.printf("Raiz x1: %.2f\nRaiz x2 %.2f \n", x1, x2);
            }
        //Passo 5: se delta for menor que 0, as raízes serão complexas
            else{
                delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                
            }
            
        }
        else{
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
        }
    }

        
    }
    
    

