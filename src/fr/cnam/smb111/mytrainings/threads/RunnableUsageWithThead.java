package fr.cnam.smb111.mytrainings.threads;

public class RunnableUsageWithThead implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        RunnableUsageWithThead m1=new RunnableUsageWithThead();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}