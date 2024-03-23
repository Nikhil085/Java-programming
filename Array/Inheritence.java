
// inheritence is  Here !

class base{

    int x;
    public int getx(){
        return  x;
    }

    public void setX( int x){
        System.out.println("i m in base Setting X Now !");
        this.x = x;
    }

    public void printme(){
        System.out.println("i m Constructer here !");
    }

    static class Derived extends base{
        int y;

        public int getY(){
            return y;
        }

        public void setY(int y){
            this.y = y;
            System.out.println("I , Y setting Here !");
        }
}

 static class Practice1 {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getx());

        Derived d = new Derived();
        d.setX(12);
        System.out.println(d.getx());
    }
    }
}
