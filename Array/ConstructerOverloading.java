// overLoad Constructer here !
class ConstructerOverloading {
    private  int height;
    private  int width;


    public ConstructerOverloading(){
        height = 12;
        width = 12;
    }

    public ConstructerOverloading(int h, int w){
        height = h;
        width = w;
    }


public void setHeight(int height){
    this.height = height;
}
public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }
    public  int getwidth(){
        return width;
    }

    public int total(){
        return  height * width;
    }



    public static void main(String[] args) {
        System.out.println("this is Custome Class !");
     ConstructerOverloading s1 = new ConstructerOverloading();
     /*   s1.setHeight(12);
        s1.setWidth(12);*/
        System.out.println(s1.getHeight());
        System.out.println(s1.getwidth());
        int result = s1.total();
        System.out.println(result);

   }
}
