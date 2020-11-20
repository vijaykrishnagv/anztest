package com.anz.wholesale.engineering.controller;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.anz.wholesale.engineering.business.impl.WholesaleEngineeringBusinessImpl;
import com.anz.wholesale.engineering.domain.Accounts;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

public class WholesaleEngineeringControllerTest {

@Mock
  private WholesaleEngineeringBusinessImpl wholesaleEngineeringBusiness;
@InjectMocks
  private WholesaleEngineeringController wholesaleEngineeringController;

  @BeforeEach
  void setMockOutput() {
    MockitoAnnotations.initMocks(this);


  }
  @DisplayName("Test the testFetchAccounts method for WholesaleEngineeringController")
  @Test
  void testFetchAccounts()  {
    List<Object> accountList = new ArrayList<>();

    when(wholesaleEngineeringBusiness.fetchAccounts())
        .thenReturn(accountList);
    ResponseEntity responseEntity = wholesaleEngineeringController.fetchAccounts();
    Assert.notNull(responseEntity);

  }

  @DisplayName("Test the testFetchTransactions method for WholesaleEngineeringController")
  @Test
  void testFetchTransactions()  {
    List<Object> transactionsList = new ArrayList<>();

    when(wholesaleEngineeringBusiness.fetchTransactions(anyString(),anyString()))
        .thenReturn(transactionsList);
    wholesaleEngineeringController.fetchTransactions("testAcc1","testAccType1");

  }

}
