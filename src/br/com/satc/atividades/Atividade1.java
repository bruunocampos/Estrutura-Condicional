/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.atividades;

//programa para calcular a media (3 notas) 

import java.util.Scanner;

//

public class Atividade1 {
    
      public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);    
      float nota1,nota2,nota3,notamin;
      System.out.println("Qual a sua primeira nota?");
      nota1= entrada.nextFloat();
      System.out.println("Qual a sua segunda nota?");
      nota2= entrada.nextFloat();
      System.out.println("Qual a sua terceira nota?");
      nota3= entrada.nextFloat();
      
      
      float media = (nota1 + nota2 + nota3)/3 ;
      
      System.out.println("Qual a nota mínima?");
      notamin= entrada.nextFloat();
      
      if (notamin <= media )
      System.out.println(Voce foi APROVADO!!!!!!);
      
      System.out.println("Voce tem direito a recuperação?");
      char rec  =  (char) entrada.nextInt();
      if (decisao.equals('sim') ){;
     
    }

      
      
       
              
                                                                                                                                                                                                                                                                                                                       
        
        
        
 
    }
{
        }
    }
    
}





































