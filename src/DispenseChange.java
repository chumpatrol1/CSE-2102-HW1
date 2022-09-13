public class DispenseChange {
    public static void main (String[] args){
        double cents = Double.parseDouble(args[0]);
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while(cents >= 25) {
            cents -= 25;
            quarters += 1;
        }
        while(cents >= 10) {
            cents -= 10;
            dimes += 1;
        }
        while(cents >= 5) {
            cents -= 5;
            nickels += 1;
        }
        while(cents >= 1) {
            cents -= 1;
            pennies += 1;
        }
        System.out.println(args[0] + " cents in coins can be given as:");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
