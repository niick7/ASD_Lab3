package edu.mum.cs.cs525.labs.skeleton;

public class P3 extends InterestPromotionDecorator {
  Account account;
  public P3(Account account){
    super(account.getAccountNumber());
    this.account = account;
  }

  @Override
  public double computeInterest() {
    double interest = account.computeInterest();
    return 0.03*interest + interest;
  }
}
