package ProducerConsumerProblem;

public class ProducerThread extends Thread{

     ProducerConsumer p;

     ProducerThread(ProducerConsumer p){
       this.p=p;
     }

    public void run(){
        int i=1;
        while(true){
            try {
                this.p.produce(i);
                Thread.sleep(4000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
//            try{Thread.sleep(4000);}catch(Exception e){}
            i++;
        }
    }

}
