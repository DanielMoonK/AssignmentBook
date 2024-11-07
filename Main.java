public class Main
{
    public static void main(String[] args)
    {
        boolean[][] scheduleOne = new boolean[8][60];
        AssignmentBook a = new AssignmentBook(scheduleOne);

        for (int i=10; i<15; i++) scheduleOne[1][i] = true;
        for (int i=30; i<45; i++) scheduleOne[1][i] = true;
        for (int i=50; i<60; i++) scheduleOne[1][i] = true;

        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));

        boolean[][] scheduleTwo = new boolean[8][60];
        AssignmentBook b = new AssignmentBook(scheduleTwo);
        
        for (int i=25; i<30; i++) scheduleTwo[1][i] = true;
        for (int i=0; i<15; i++) scheduleTwo[2][i] = true;
        for (int i=41; i<60; i++) scheduleTwo[2][i] = true;
        for (int i=5; i<30; i++) scheduleTwo[3][i] = true;
        for (int i=44; i<60; i++) scheduleTwo[3][i] = true;

        // int period = 2;
        // while (period < 5){
        //     System.out.println("Period" + period);
        //     b.printPeriod(period);
        //     period++;
        // }

        b.printPeriod(4);
        System.out.println(b.makeAppointment(2, 4, 22));
        b.printPeriod(4);
    }
}