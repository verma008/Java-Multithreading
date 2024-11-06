package ProducerConsumerProblem;

public class ConsumerThread extends Thread{

    ProducerConsumer p;
    ConsumerThread(ProducerConsumer p){
        this.p=p;
    }
    public void run(){
        while(true)
        {
            try {
                this.p.consume();
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

//            try{Thread.sleep(2000);}catch(Exception e){}
        }
    }
}
