package edu.mum.cs.cs525.labs.skeleton;

public class P2 extends InterestPromotionDecorator {
  Account account;
  public P2(Account account){
    super(account.getAccountNumber());
    this.account = account;
  }

  @Override
  public double computeInterest() {
    double interest = account.computeInterest();
    return 0.02*interest + interest;
  }
}
