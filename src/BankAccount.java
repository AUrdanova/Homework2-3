public class BankAccount {
    private double amount;


public BankAccount(){

}
public BankAccount (double amount){
    this.amount = amount;

}
public double getAmount(){
    return amount;
}
public double deposit(double sum) {
    return this.amount += sum;

}
public double withDraw(double sum) throws LimitException {
    if(sum > this.amount) {
        throw new LimitException("Ошибка, снимаемая сумма больше чем остаток на балансе", this.amount);

    } else {
        return this.amount
    }
}
}