public class MethodOverriding  {
    void show(){
        System.out.println("Its Paren CLass !");
    }

    public static void main(String[] args) {
      MethodOverriding m1 = new MethodOverriding();
      m1.show();
      MethodOverriding m2 = new child();
      m2.show();
    }
}

class child extends MethodOverriding{
    void show(){
        System.out.println("Its Child Class !");
    }
}


