package com.anz.wholesale.engineering.controller;

import com.anz.wholesale.engineering.business.impl.WholesaleEngineeringBusinessImpl;
import java.util.List;
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
    List<Object> accountsList = wholesaleEngineeringBusiness.fetchAccounts();
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
    List<Object> transactionList = wholesaleEngineeringBusiness
        .fetchTransactions(accountNumber, accountType);
    return new ResponseEntity<>(transactionList, HttpStatus.OK);
  }

}
