public class Loop {
    public static void main(String[] args) {
//        int[]daysInMonth = new int[12];
//        daysInMonth[0] = 31;
//        daysInMonth[1] = 28;
//        daysInMonth[2] = 31;
//        daysInMonth[3] = 30;
//        daysInMonth[4] = 31;
//        daysInMonth[5] = 30;
//        daysInMonth[6] = 31;
//        daysInMonth[7] = 31;
//        daysInMonth[8] = 30;
//        daysInMonth[9] = 31;
//        daysInMonth[10] = 30;
//        daysInMonth[11] = 31;
//
//        for (int i = 0; i <daysInMonth.length ; i++) {
//            System.out.println(daysInMonth[i]);
//
//        }
//
//        int[]b = {1,2,3};
//        System.out.println(b[1]);
//        System.out.println(daysInMonth[0]);
        int[] first = new int[901];
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;

        }
        int[] seconds = new int[first.length];
        for (int i = 0, j= first.length-1; i < first.length ; i++,j--) {
            seconds[j]= first[i];

        }
        for (int i: seconds
             ) {
            System.out.println(i);

        }
    }
}
