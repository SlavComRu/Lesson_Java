public class HomeWork {
    static boolean win = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000);
        System.out.println(random);

        Thread timer = new Thread(new Runnable() {

            @Override
            public void run() {
                int i = 0;

                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {

                }
            }
        });
        timer.start();

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win){
                int guessNumber = (int) (Math.random() * 1000000000);
                if (guessNumber==random){
                    win = true;
                    System.out.println(guessNumber);
                }}
            }
        });
        player.start();
    }
}
