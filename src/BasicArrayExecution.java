import java.util.Scanner;

public class BasicArrayExecution {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int candies=sc.nextInt();

        System.out.println("No of Candies ="+candies);

        int noOfElephants=sc.nextInt();

        System.out.println("No of Elephants ="+noOfElephants);

        int[] arrayOfElephants=new int[noOfElephants];
        int candiesNeeded=0;
        for(int index=0;index<noOfElephants;index++){
            arrayOfElephants[index]=sc.nextInt();
             candiesNeeded+=arrayOfElephants[index];
        }

        if(candies>=candiesNeeded){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }


}
