/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BADIEM;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author vuong
 */
public class Consumer extends Thread { 
    Producer producer;
    Consumer(Producer p) {
        producer = p;
    }

    @Override
    public void run() {
        //super.run(); //To change body of generated methods, choose Tools | Templates.       
        
        
        for(int j = 1; j<=main.MAXQUEUE(); j++) {           
        if(j%2 == 0)
        {
            System.out.println(getName());
            System.out.println("Số chẵn: "+ j);
        }
        if(j%2 != 0)
        {
            System.out.println(getName());
            System.out.println("Số lẻ: "+ j);
        }
            try {
                Consumer.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
                }
       }           
    }  
}
