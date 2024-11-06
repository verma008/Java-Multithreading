class UserThread extends Thread{

    public void run(){
        // task for thread
        System.out.println("Thread is running");
    }
}

public class ThreadOperations {
    public static void main(String[] args) {

//        for(int i=0;i<=10;i++){
//            System.out.println("value of i: "+i);
//
//            try { // sleep()
//                Thread.sleep(2000);
//            }catch(Exception e){
//
//            }
//        }

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.threadId());
        thread.setName("archana");
        System.out.println(thread.getName());
        System.out.println(thread.getId());  // getId() deprecated since java 19


     // creating obj of UserThread class
        UserThread u=new UserThread();
        u.start();
    }

}
