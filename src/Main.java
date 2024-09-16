public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        //Use the isValid method with each number
        //Return false the moment num1, num2, or num3 returns false from isValid
        if(!isValid(num1)){
            return false;
        }

        else if(!isValid(num2)){
            return false;
        }

        else if(!isValid(num3)){
            return false;
        }


        //Store the last most digit of each number in a variable
        int num1Last = num1 % 10;
        int num2Last = num2 % 10;
        int num3Last = num3 % 10;
        //num1Last, num2Last, etc...
        //To get the last digit.  Mod the number by 10.

        //Check if num1Last is equal to num2Last if so return true
        //Check if num2Last is equal to num3Last if so return true
        //Check if num1Last is equal to num3Last if so return true

        if(num1Last == num2Last){
            return true;
        }

        if(num2Last == num3Last){
            return true;
        }

        if(num1Last == num3Last){
            return true;
        }

        //At this point every test failed to return something
        //so...



        return false;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 99;
    }
}
