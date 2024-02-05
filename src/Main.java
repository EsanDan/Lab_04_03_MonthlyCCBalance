
    public class Main
        {
            public static void main(String[] args)
            {
                double creditCardBalance = 5000;
                double interestRate = 0.17;
                double firstMonthInterest = 0;
                double firstMonthBalance = 0;
                double secondMonthInterest = 0;
                double secondMonthBalance = 0;

                firstMonthInterest = creditCardBalance * interestRate;
                firstMonthBalance = firstMonthInterest + creditCardBalance;

                System.out.println("Your first month's interest is " + firstMonthInterest);
                System.out.println("Your first month balance is " + firstMonthBalance);

                secondMonthInterest = firstMonthBalance * interestRate;
                secondMonthBalance = firstMonthBalance + secondMonthInterest;

                System.out.println("Your second months interest is " + secondMonthInterest);
                System.out.println("Your second month balance is " + secondMonthBalance);


            }
        }