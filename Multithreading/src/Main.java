public class Main {
    static boolean isFive = false;
    public static void main(String[] args) {

        Thread times1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){
                    try {
                        System.out.println(i);
                        Thread.sleep(1000);
                        if (i==5)
                            isFive = true;
                        i++;
                    } catch (Exception e) {
                    }
                }
            }
        });
        times1.start();

        Thread times2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!isFive){
                    try {
                        System.out.println(i);
                        Thread.sleep(1000);
                        i++;
                    } catch (Exception e) {
                    }
                }
            }
        });
        times2.start();


    }
}
