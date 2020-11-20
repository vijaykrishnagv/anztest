package com.anz.wholesale.engineering.business.impl;

import com.anz.wholesale.engineering.business.WholesaleEngineeringBusiness;
import com.anz.wholesale.engineering.respository.AccountsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WholesaleEngineeringBusinessImpl implements WholesaleEngineeringBusiness {

  @Autowired
  private AccountsRepository accountsRepository;

  /**
   * This method fetches all the accounts details
   *
   * @return list of all the users' accounts
   */
  @Override
  @Transactional
  public List<Object> fetchAccounts() {
    List<Object> accountsList = accountsRepository.findAllAccounts();
    return accountsList;
  }

  /**
   * This method fetches all the transactions of an user account
   *
   * @param accountNumber account number of the user
   * @param accountType   account type of the user's account
   * @return list of transactions of a user's ccount
   */
  @Override
  public List<Object> fetchTransactions(String accountNumber, String accountType) {
    List<Object> transactionList = accountsRepository
        .findAllAccountTransactions(accountNumber, accountType);
    return transactionList;
  }
}
