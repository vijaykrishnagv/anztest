package com.anz.wholesale.engineering.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Accounts {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "account_number", columnDefinition = "BIGINT", nullable = false)
  private String accountNumber;

  @Column(name = "account_name", nullable = false)
  private String accountName;

  @Column(name = "account_type", nullable = false)
  private String accountType;

  @Column(name = "currency", nullable = false)
  private String currency;

  @Column(name = "balance_date", nullable = false)
  private Date balanceDate;

  @Column(name = "opening_balance", nullable = false)
  private BigDecimal openingBalance;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "account_number_id", nullable = false, referencedColumnName = "id")
  private List<Transaction> transaction;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Transient
  public List<Transaction> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<Transaction> transaction) {
    this.transaction = transaction;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Date getBalanceDate() {
    return balanceDate;
  }

  public void setBalanceDate(Date balanceDate) {
    this.balanceDate = balanceDate;
  }

  public BigDecimal getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(BigDecimal openingBalance) {
    this.openingBalance = openingBalance;
  }
}
