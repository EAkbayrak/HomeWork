package HomeWork.Class22;

class Task2 {
    public static void main(String[] args) {
        CreditCard member1= new CreditCard();

        member1.getInterest(4000);
        member1.printInterestRate();

        Visa member2 = new Visa();
        member2.getInterest(6000);
        member2.printInterestRate();

        AX member3 = new AX();
        member3.getInterest(60000);
        member3.printInterestRate();   }}
class CreditCard{
    double balance; double interestRate;
    double getInterest(double balance){
        this.balance=balance;

        if(balance < 5000){
            interestRate = (2.0/100.0);
        }else if(balance <=10000 && balance >= 5000){
            interestRate = 5.0/100.0;
        }else if(balance > 10000){
            interestRate = (7.5/100.0);
        }else {interestRate=5;}

        return interestRate;
    }
    void printInterestRate(){
        System.out.println("Based on your balance of £" + balance + " with the credit card type, your interest rate will be " + interestRate + "%");
    }}

class Visa extends CreditCard {

    @Override   double getInterest(double balance){
        this.balance=balance;

        if(balance < 5000){
            interestRate = (5.0/100.0);
        }else if(balance <=10000 && balance >= 5000){
            interestRate = 8.0/100.0;
        }else if(balance > 10000){
            interestRate = (10.0/100.0);
        }else {interestRate=5;}

        return interestRate;}}
class AX extends CreditCard{
    double getInterest(double balance){
        this.balance=balance;

        if(balance < 5000){
            interestRate = (1/100.0);
        }else if(balance <=10000 && balance >= 5000){
            interestRate = 2/100.0;
        }else if(balance > 10000){
            interestRate = (11/100.00);
        }else {interestRate=5;}

        return interestRate;
    }
}