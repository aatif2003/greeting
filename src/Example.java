class Greeting {
    public void SayHello() {
        System.out.println("Hello");
    }
}
    class India{
        Greeting g=new Greeting(){
            public void SayHello(){
                System.out.println("Namaste");
            }
        };
    }



















public class Example {
    public static void main(String args[]){
        India india=new India();
        india.g.SayHello();


    }
}
