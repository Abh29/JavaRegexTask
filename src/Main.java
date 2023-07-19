public class Main {
    public static void main(String[] args) {

        String date = "03/03/1655 12:13";   //this should return true
        System.out.println(Tasks.task01(date));
        date = "04/31/1556 12:12";     //this should return false  (april has only 30 days )
        System.out.println(Tasks.task01(date));

        System.out.println(".......................................................");

        String realNumber = "-0.2";
        System.out.println(Tasks.task02(realNumber));

        System.out.println(".......................................................");

        String[] binNums = {"00000","1111","00101","101010","010","1001110","10110101"};
        Tasks.task03(binNums);

        System.out.println(".......................................................");


        Tasks.task04();

    }
}