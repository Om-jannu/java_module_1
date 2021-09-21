/*
Pooja would like to withdraw X $US from an ATM.
The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the
withdrawal transaction (including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
*/

class ATM {
    public static void main(String[] args) {
        float withdrawal,balance=3000, X=1500;

        if (X>0 && X<2000 && X%5 == 0) {
            withdrawal = X + 0.15F;
            System.out.println(" balance =  " +(balance - withdrawal));
        }
        else
            System.out.println(" Withdrawal Unsuccessful");
    }
}
