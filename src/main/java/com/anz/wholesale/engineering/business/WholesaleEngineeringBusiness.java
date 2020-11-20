package com.anz.wholesale.engineering.business;

import java.util.List;

public interface WholesaleEngineeringBusiness {

  List<Object> fetchAccounts();

  List<Object> fetchTransactions(String accountNumber, String accountType);
}
