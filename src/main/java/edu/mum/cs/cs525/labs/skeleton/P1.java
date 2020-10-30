package edu.mum.cs.cs525.labs.skeleton;

public class P1 extends InterestPromotionDecorator {
  Account account;
  public P1(Account account){
    super(account.getAccountNumber());
    this.account = account;
  }

  @Override
  public double computeInterest() {
    double interest = account.computeInterest();
    return 0.01*interest + interest;
  }
}
