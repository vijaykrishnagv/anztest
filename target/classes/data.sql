insert into Accounts (id,account_name,account_number,account_type,balance_date,currency,opening_balace) values ('1','accname1',1234567, 'savings', '2020-11-11', 'USD', 12345.50);
insert into Transaction (id,account_number_id,value_date,debit_amount,credit_amount,debit_or_credit,transaction_narrative) values ('11','1','2020-11-11',null,344.50,'Credit','Monthly interest');