/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BADIEM;

import java.util.Vector;

/**
 *
 * @author vuong
 */
public class Producer extends Thread {
    public static final int MAXWAIT(){
        return 500;
    }
 //   static final int MAXQUEUE = 10;
    private Vector messages = new Vector();
    @Override
    public void run() {
        //super.run(); //To change body of generated methods, choose Tools | Templates.
        

            for(int i = 1; i <= main.MAXQUEUE(); i++) {

                try {
                    System.out.println("\n"+getName());
                    System.out.println(i + " ");
                    Thread.sleep(1000);
                }   catch (InterruptedException ie) {
                        System.out.println(ie.toString());
                    }
    
        }
        
        
        
        System.out.println();
    }
     private synchronized void putMessage() throws InterruptedException {
        while (messages.size() == main.MAXQUEUE()) {
            wait();
        }
        messages.addElement(new java.util.Date().toString());
       // System.out.println("Dãy số: ");
        notify();
        //Sau khi event put message được xảy ra, hàm notify() đươc gọi để đánh thức - kích hoạt lại thred getMessage tiếp tục hoạt động.
    }
      // Được gọi bởi Consumer
    public synchronized String getMessage() throws InterruptedException {
        notify();
        while (messages.size() == main.MAXQUEUE()) {
            wait();
            //Gọi hàm wait() để đồng bộ hoá đoạn code sau, Thread hiện tại sẽ tạm dừng, rơi vào trạng thái nằm chờ đến khi method notify được gọi.
        }
        String message = (String) messages.firstElement();
        messages.removeElement(message);
        return message;
    }
   /* public static void main(String[] args) {
        Mythread3 t1 = new Mythread3("Thread 1");
        Mythread3 t2 = new Mythread3("Thread 2");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            System.err.println(ie.toString());
        }
        t2.start();
    }   */
    
}
