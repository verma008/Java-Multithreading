package ProducerConsumerProblem;

class ProducerConsumer {

    int n;
    boolean f=false;
    // f=false: producer chance
    // f=true consumer chance
    synchronized public void produce(int n) throws Exception{
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Producer produced "+this.n);
        f=true;
        notify();
    }
    synchronized public int consume() throws Exception{
        if(!f){
            wait();
        }
        System.out.println("Consumer consumed "+this.n);
        f=false;
        notify();
        return this.n;
    }

}
