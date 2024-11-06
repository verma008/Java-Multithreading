package ProducerConsumerProblem;

public class Main{
    public static void main(String[] args) {

        ProducerConsumer pc=new ProducerConsumer();
        ProducerThread p=new ProducerThread(pc);
        ConsumerThread c=new ConsumerThread(pc);

        p.start();
        c.start();
    }
}
