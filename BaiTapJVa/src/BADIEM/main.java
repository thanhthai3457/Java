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
public class main {

    public static final int MAXQUEUE(){
        return 50;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Producer producer = new Producer();
            producer.start();
            producer.sleep(producer.MAXWAIT());
     
            Consumer consumer = new Consumer(producer);
            consumer.start();
       
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
