package com.anz.wholesale.engineering.controller;

import com.anz.wholesale.engineering.business.impl.WholesaleEngineeringBusinessImpl;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anz-wholesale-engineering")
public class WholesaleEngineeringController {
  private static final Logger  LOGGER = LoggerFactory.getLogger(WholesaleEngineeringController.class);
  @Autowired
  private WholesaleEngineeringBusinessImpl wholesaleEngineeringBusiness;

  /**
   * This method takes the request to fetch all the accounts details and triggers the business
   * logic
   *
   * @return ResponseEntity with list of all the users' accounts as body and HttpStatus
   */
  @GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> fetchAccounts() {

    LOGGER.trace("Received request to fetch User accounts");
    List<Object> accountsList = wholesaleEngineeringBusiness.fetchAccounts();
    LOGGER.debug("No. of accounts found : {}",accountsList.size());
    return new ResponseEntity<String>(accountsList.toString(), HttpStatus.OK);
  }

  /**
   * This method takes the request to fetch all the accounts details and triggers the business
   * logic
   *
   * @return ResponseEntity with list of all the users' accounts as body and HttpStatus
   */
  @GetMapping(value = "/transactions", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> fetchTransactions(
      @RequestParam(name = "account_number", required = true) String accountNumber,
      @RequestParam(name = "account_type", required = true) String accountType) {

    LOGGER.info("Received request to fetch transaction details of an user account {} and account type : {}",accountNumber, accountType);
    List<Object> transactionList = wholesaleEngineeringBusiness
        .fetchTransactions(accountNumber, accountType);
    LOGGER.debug("No. of transactions found : {} for account number: {}",transactionList.size(), accountNumber);
    return new ResponseEntity<>(transactionList, HttpStatus.OK);
  }

}
