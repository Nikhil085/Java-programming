public  class Main{

    public synchronized void printTable(int n){
        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(500);
                System.out.println(i * n);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
           Main table = new Main();

        Thread t1 = new ThreadOne(table);
        Thread t2 = new ThreadTwo(table);

        t1.start();
        t2.start();

    }
}

class  ThreadOne extends Thread{
    Main t;

    public ThreadOne(Main t){
        this.t = t;
    }
    public void run(){
        t.printTable(13);
    }
}



class ThreadTwo extends Thread{
    Main t;

    public ThreadTwo(Main t){
        this.t = t;
    }
    public void run(){
        t.printTable(15);
    }
}