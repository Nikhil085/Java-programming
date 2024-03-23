
class Multi extends Thread{
    public synchronized void printT(int n){
        for(int i=1; i<=n; i++){
       try{
           Thread.sleep(500);
           System.out.println(n*1);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
        }
    }
}

class Practice{
    public static void main(String[] args) {
     Multi s = new Multi();
        Thread t1 = new ThreadOne(s);
        Thread t2 = new ThreadOne(s);
        t1.start();
        t2.start();
    }
}

class ThreadOne extends Thread{
    Multi m;
   public ThreadOne(Multi m) {
       this.m = m;
   }
    public void run(){
           m.printT(13);
    }
}
class ThreadTwo extends Thread{
    Multi m;
    public ThreadTwo(Multi m) {
        this.m = m;
    }
    public void run(){
        m.printT(12);
    }
}