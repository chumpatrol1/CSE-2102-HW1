public class ComputeInterest {
    public static void main (String[] args) {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double duration = Double.parseDouble(args[2]);

        double simple_interest = Math.round(principal * (rate/100) * duration);
        simple_interest = principal + simple_interest;
        double compound_interest = Math.round(principal * Math.pow((1 + rate/100), (duration)) * 100);
        compound_interest = compound_interest/100;
        double difference = Math.round(100*(compound_interest - simple_interest));
        difference = difference/100;
        System.out.println("The amount with simple interest is: " + simple_interest);
        System.out.println("The amount with compound interest is: " + compound_interest);
        System.out.println("The difference is: " + difference);
    }
}