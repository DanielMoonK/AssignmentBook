public class AssignmentBook
{
    //Schedules are formatted so that rows will be periods, columns will be intervals of minutes available
    //Assume that each interval of minutes cycles from "available" and "not available", with the first interval being "not available"
    private int[][] schedule;

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
        return
    }

    private boolean isMinuteFree(int period, int minute){
        while(minute < )
    }
}