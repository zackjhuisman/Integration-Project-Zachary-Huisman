// Zachary Huisman
// I love the game borderlands and wanted to recreate the game's random gun generator in java
import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] argh) {

        /*
            for class code
            boolean can only store a true or false values.
            byte can only store values from −128 to 127.
            char stores unicode characters.
            short can only store values from −32768 to 32767.
            int can only store values from −2,147,483,648 to 2,147,483,647.
            long can only store values from 9,223,372,036,854,775,808 to 9,223,372,036,854,755,807.
            float can only store values from 3.4e−038 to 3.4e+038 can also store the decimal places of numbers.
            double can only store values from 1.7e−308 to 1.7e+038 can also store the decimal places of numbers.
        */
        double criteriaDouble = 1.337;
        //Final is in randomRange.java line 4 and finals are used to prevent a class, variable, or methods from being modified.
        int criteriaCasting = (int) criteriaDouble; //casting is turing one data type into another
        String criteriaStringNum1 = "Hello";
        String criteriaStringNum2 = "olleH";
        int criteriaStringMethodsNum1 = criteriaStringNum1.compareTo(criteriaStringNum2);
        boolean criteriaStringMethodsNum2 = criteriaStringNum1.endsWith("o");
        int criteriaStringMethodsNum3 = criteriaStringNum1.hashCode();
        String criteriaStringNum3 = "\tte\bst\n";
        //method in randomRange.java line 10
        //method call on line 111
        //method header in randomRange.java line 16 "int getRandom"
        //random class on line 82
        int criteriaMath = Math.abs(-4);
        //if on line 76
        String criteriaSwitch;
        switch (criteriaMath) {
            case 1:
                criteriaSwitch = "Go";
                break;
            case 2:
                criteriaSwitch = "Go";
                break;
            case 3:
                criteriaSwitch = "Go";
                break;
            case 4:
                criteriaSwitch = "Stop";
                break;
            case 5:
                criteriaSwitch = "To Far";
                break;
        }
        //compareTo on line 26 and equals on line 76. == only works on java data types. for objects you have to use compareTo or equals.
        int criteriaOperatorsNum1 = 1 + 1;
        int criteriaOperatorsNum2 = 2 - 1;
        int criteriaOperatorsNum3 = 3 * 3;
        int criteriaOperatorsNum4 = 2 / 6;
        int criteriaOperatorsNum5 = 6 % 4;
        int criteriaOperatorsNum6 = 1;
        criteriaOperatorsNum6++;
        int criteriaOperatorsNum7 = 2;
        criteriaOperatorsNum6--;
        int criteriaOperatorsNum8 = 4;
        criteriaOperatorsNum8 += 4;
        //relational operator on line 109 and conditional operator on 86 99
        //Operator Precedence is the order that java calculates expressions in the same operation. i.e. multiplication first then addition.

        //actual program
        System.out.println("Hello! ");
        boolean runTime = true;
        while (runTime) {
            System.out.println("Want To Roll For A Gun? (\"Y\" or \"N\")");
            Scanner userQuestion = new Scanner(System.in);
            String userQuestionAnswer = userQuestion.next();
            if (userQuestionAnswer.equalsIgnoreCase("Y")) {
                //Set gun strings for saving and reading
                String gunText = "";
                String gunAssemble = "Gun Code: ";

                //Set randoms for rarity
                Random gunChance = new Random();
                int gunRarity = gunChance.nextInt(100);

                //Check rarity
                if (gunRarity <= 5) {
                    gunText += "You Have Found A Legendary";
                    gunAssemble += "0-";
                } else if (gunRarity > 5 && gunRarity <= 15) {
                    gunText += "You Have Found An Epic";
                    gunAssemble += "1-";
                } else if (gunRarity > 15 && gunRarity <= 30) {
                    gunText += "You Have Found A Rare";
                    gunAssemble += "2-";
                } else if (gunRarity > 30 && gunRarity <= 60) {
                    gunText += "You Have Found An Uncommon";
                    gunAssemble += "3-";
                } else if (gunRarity > 60 && gunRarity <= 100) {
                    gunText += "You Have Found A Common";
                    gunAssemble += "4-";
                }

                //Set randoms for manufacturer
                Random gunManufacturer = new Random();
                int gunManufacturerNum = gunManufacturer.nextInt(8);
                gunAssemble += Integer.toString(gunManufacturerNum) + "-";

                //Check manufacturer and set randoms for gun type
                if (gunManufacturerNum == 0) {
                    gunText += " Bandit";
                    randomRange gunType = new randomRange(1, 4);
                } else if (gunManufacturerNum == 1) {
                    gunText += " Dahl";
                    randomRange gunType = new randomRange(10, 22);
                } else if (gunManufacturerNum == 2) {
                    gunText += " Hyperion";
                    randomRange gunType = new randomRange(10, 22);
                } else if (gunManufacturerNum == 3) {
                    gunText += " Jakobs";
                    randomRange gunType = new randomRange(10, 22);
                } else if (gunManufacturerNum == 4) {
                    gunText += " Maliwan";
                    randomRange gunType = new randomRange(10, 22);
                } else if (gunManufacturerNum == 5) {
                    gunText += " Tediore";
                    randomRange gunType = new randomRange(10, 22);
                } else if (gunManufacturerNum == 6) {
                    gunText += " Torgue";
                    randomRange gunType = new randomRange(10, 22);
                } else if (gunManufacturerNum == 7) {
                    gunText += " Vladof";
                    randomRange gunType = new randomRange(10, 22);
                }

                //for testing
                System.out.println("\n" + gunText);
                System.out.println(gunAssemble + "\n");
                String[] gunParts = gunAssemble.split("-");

                List<Integer> gunTypes = new ArrayList<>();
                randomRange type = new randomRange(4, 4);
                type.addRange(6, 6);

            } else if (userQuestionAnswer.equalsIgnoreCase("N")) {
                System.exit(0);
            } else {
                System.out.println("\nPlease Enter Either \"Y\" or \"N\"");
            }
        }
    }
}



