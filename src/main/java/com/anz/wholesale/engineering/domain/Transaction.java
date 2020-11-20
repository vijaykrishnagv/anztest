package com.anz.wholesale.engineering.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "value_date", nullable = false)
  private Date valueDate;

  @Column(name = "debit_amount")
  private BigDecimal debitAmount;

  @Column(name = "credit_amount")
  private BigDecimal creditAmount;

  @Column(name = "debit_or_credit", nullable = false)
  private String debitOrCredit;

  @Column(name = "transaction_narrative")
  private String transactionNarrative;

  /*@Column(name= "account_number_id")
  private String accountNumberId;*/


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getValueDate() {
    return valueDate;
  }

  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }

  public BigDecimal getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(BigDecimal debitAmount) {
    this.debitAmount = debitAmount;
  }

  public BigDecimal getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(BigDecimal creditAmount) {
    this.creditAmount = creditAmount;
  }

  public String getDebitOrCredit() {
    return debitOrCredit;
  }

  public void setDebitOrCredit(String debitOrCredit) {
    this.debitOrCredit = debitOrCredit;
  }

  public String getTransactionNarrative() {
    return transactionNarrative;
  }

  public void setTransactionNarrative(String transactionNarrative) {
    this.transactionNarrative = transactionNarrative;
  }

  /*public String getAccountNumberId() {
    return accountNumberId;
  }

  public void setAccountNumberId(String accountNumberId) {
    this.accountNumberId = accountNumberId;
  }*/
}
