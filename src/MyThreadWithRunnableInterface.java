// creating our thread using Runnable Interface

class MyThreadWithRunnableInterface implements Runnable{
     public void run(){

         // task for the thread print number 1 to 5
         for(int i=1; i<=5; i++){
             System.out.println(i);

             try {
                 Thread.sleep(2000);
             }catch(Exception e){
                 e.printStackTrace();
             }
         }

     }

    public static void main(String[] args) {

         MyThreadWithRunnableInterface myThread=new MyThreadWithRunnableInterface();
         Thread t=new Thread(myThread);
         t.start();
    }
}
