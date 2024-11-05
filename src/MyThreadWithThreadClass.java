//Creating thread using Thread class

public class MyThreadWithThreadClass extends Thread{

    public void run()
    {
        // task for the thread print 1 to 5
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }catch(Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        MyThreadWithThreadClass myThread=new MyThreadWithThreadClass();
        myThread.start();
    }
}
