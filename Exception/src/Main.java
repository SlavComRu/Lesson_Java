public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
            String s = "123gfb";
            int i = Integer.parseInt(s);

        }catch (ArithmeticException e){}
        catch (Exception e){}

        System.out.println("Hello");

        int [] array = new int[5];
        try {
            array[1] = 6;
            array[6] = 7;


            int b = array[1] + array[6];
            System.out.println(b);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }



    }
}
