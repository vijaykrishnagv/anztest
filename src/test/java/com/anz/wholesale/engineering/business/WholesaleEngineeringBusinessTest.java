package com.anz.wholesale.engineering.business;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.anz.wholesale.engineering.business.impl.WholesaleEngineeringBusinessImpl;
import com.anz.wholesale.engineering.controller.WholesaleEngineeringController;
import com.anz.wholesale.engineering.respository.AccountsRepository;
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

public class WholesaleEngineeringBusinessTest {

  @Mock
  private AccountsRepository accountsRepository;
  @InjectMocks
  private WholesaleEngineeringBusinessImpl wholesaleEngineeringBusiness;

  @BeforeEach
  void setMockOutput() {
    MockitoAnnotations.initMocks(this);
  }

  @DisplayName("Test the testFetchAccounts method for WholesaleEngineeringBusinessImpl")
  @Test
  void testFetchAccounts()  {

    List<Object> accountsList = wholesaleEngineeringBusiness.fetchAccounts();
    Assert.notNull(accountsList);

  }

  @DisplayName("Test the testFetchAccounts method for WholesaleEngineeringBusinessImpl")
  @Test
  void testFetchTransactions()  {

    List<Object> transactionsList = wholesaleEngineeringBusiness.fetchTransactions(anyString(),anyString());
    Assert.notNull(transactionsList);

  }

}
