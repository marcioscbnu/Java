package ProjetoThreads;

public class ProjetoThreads {
	static int i = 0;
	public static void main(String[] args) {
		new Thread(thread1).start();
		new Thread(thread2).start();

	}
	
	private static void contador(String name){
        i++;
        System.out.println("Contador atual : " + i + ", thread : " + name);
    }

    private static Runnable thread1 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i < 5; i++){
                    contador("thread1");
                }
            } catch (Exception e){}

        }
    };

    private static Runnable thread2 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i < 5; i++){
                    contador("thread2");
                }
            } catch (Exception e){}
       }
    };
}
