package day1_basic_programs;

public class FindSumUsingCommandLine {
    public static void main(String[] args) {
        //Note : The command line arguments  are stored in the String[] args of the main() method of the program
        //Addition
        int a = Integer.parseInt(args[0]); //First Argument
        int b = Integer.parseInt(args[1]);  //Second Argument
        int sum = a + b;
        System.out.println("Sum of Two Numbers is :"+sum);

     /*   //Multiplication
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z= Integer.parseInt(args[2]);
        int result = x*y*z;
        System.out.println("Sum of Two Numbers is :"+result);

      */
    }
}
