public class Main
{
    public static void main(String[] args)
    {
        int[][] dayOne = {
            {10, 5, 15, 15, 10, 5},
            {15, 15, 20, 10},
            {9, 11, 30, 5, 5},
            {15, 5, 5, 15, 20},
            {30, 20, 10},
            {10, 20, 30},
            {10, 5, 5, 15, 25},
            {5, 15, 15, 10, 5, 10}
        };
        AssignmentBook dayEight = new AssignmentBook(dayOne);
        dayEight.testIsMinFree(1, 20);
    }
}