package ConsumerPackage;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable =()->{
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        };
        new  Thread(runnable).start();
    }
}
