import java.util.Scanner;

public class SquaresThing {
    public static void main(String[] args){
        System.out.println("Beginning");
        for (Long i = 93222350L; i < 93222360; i++){
            if ((Math.pow((2*(Math.pow(i,2))),.5))%1 == 0){
                System.out.println("Found it: "+i);
                break;
            }
        }
        System.out.println("No match");
    } 
}