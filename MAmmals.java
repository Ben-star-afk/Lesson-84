class Mammals{
    void mam(){
        System.out.println("Inside Lion Class");
    }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}
class human extends Mammals{
    void hum(){
        System.out.println("Inside Human");
    }
}
class Main3{
    public static void main(String args[]){
        Lion obj=new Lion();
        obj.hum();
        obj.roar();
        obj.mam();
    }
}