/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Brasileirao;

/**
 *
 * @author Erick Pereira
 */
public class Brasileirao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        time l[]=new time[6];
        l[0]=new time("Cruzeiro ","Brasil","A",11,2,1);
        l[1]=new time("Palmeiras","Brasil","A",14,2,3);
        l[4]=new time("Athletico Pr","Brasil","B",5,4,3);
        l[5]=new time("Gremio","Brasil","B",12,2,4);
       Jogo Br01= new Jogo();
       Br01.marcarjogo(l[4], l[5]);
       Br01.jogar();
       l[0].status();
       l[1].status();
       System.out.println("-----------------");
       System.out.println(l[0].toString());
       
     
       
    }
    
}
    
