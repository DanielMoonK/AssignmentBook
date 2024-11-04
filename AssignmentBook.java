public class AssignmentBook
{
    //Schedules are formatted so that rows will be periods, columns will be intervals of minutes available
    //Assume that each interval of minutes cycles from "available" and "not available", with the first interval being "not available"
    private int[][] schedule;
    private int sumOfMin = 0;

    public AssignmentBook(int[][] userSchedule){
        schedule = userSchedule;
    }

    public String toString(){
        String s = "";
        for (int row=0; row < schedule.length; row++){
            for (int col=0; col < schedule.length; col++){
                s += schedule[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }

    private boolean isMinuteFree(int period, int minute){
        // for(int i=0; i<schedule[period].length; i++){
        //     sumOfMin += schedule[period][i];
        // }
        if(minute < schedule[period][0]){
            return false;
        }
        for(int i=0; i<schedule[period].length-1; i++){
            sumOfMin += schedule[period][i];
            // System.out.println(sumOfMin);
            // System.out.println(schedule[period][1]);
            if((i % 2 == 0) && (minute > sumOfMin) && (minute < (sumOfMin + schedule[period][i]))){
                return true;
            }
            if((i % 2 == 1) && (minute > sumOfMin) && (minute < (sumOfMin + schedule[period][i]))){
                return false;
            }
        }
        return false;
    }



    public void testIsMinFree(int period, int minute){
        System.out.println(isMinuteFree(period, minute));
    }
}