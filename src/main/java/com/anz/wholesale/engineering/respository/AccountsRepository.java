package com.anz.wholesale.engineering.respository;

import com.anz.wholesale.engineering.domain.Accounts;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

  @Query(value = "select a.id, a.account_number, a.account_name,a.account_type,a.balance_date, a.currency,a.opening_balance from accounts a", nativeQuery = true)
  List<Object> findAllAccounts();

  @Query(value = "select b.id, a.account_number, a.account_name, a.currency,b.credit_amount, b.debit_amount, b.debit_or_credit, b.value_date,b.transaction_narrative from accounts a, transaction b where a.id=b.account_number_id and a.account_number=:accountNumber and a.account_type=:accountType", nativeQuery = true)
  List<Object> findAllAccountTransactions(String accountNumber, String accountType);


}
