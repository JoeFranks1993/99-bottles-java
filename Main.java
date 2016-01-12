package edu.htc;

public class Main {

    public static void main(String[] args) {

    sing();


    }




    public static void sing(){
        int BottleCount = 99;
        String Bottles = " Bottles ";
        String Beverage = " beer";

        for(int i = 99; i > 0; i--){


            System.out.println(BottleCount + Bottles + "of" + Beverage + " on the wall.");
            System.out.println(BottleCount + Bottles + "of" + Beverage +"!");
            System.out.println("Take one down. Pass it around");
            BottleCount = BottleCount - 1;

            if(BottleCount == 1){
                Bottles = " Bottle ";
            }
            if(BottleCount == 0){
                System.out.println("No more bottles of" + Beverage + " on the wall!");
            }
            else{
            System.out.println(BottleCount + Bottles + "of" + Beverage + " on the wall.");
                System.out.println("");
        }
        }






    }


}
