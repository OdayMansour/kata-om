Response to the Bank Account Kata:
https://gist.github.com/abachar/d20bdcd07dac589feef8ef21b487648c

# Bank account kata
Think of your personal bank account experience When in doubt, go for the simplest solution

# Requirements
- Deposit and Withdrawal
- Account statement (date, amount, balance)
- Statement printing
 
# User Stories
##### US 1:
**In order to** save money  
**As a** bank client  
**I want to** make a deposit in my account  
 
##### US 2: 
**In order to** retrieve some or all of my savings  
**As a** bank client  
**I want to** make a withdrawal from my account  
 
##### US 3: 
**In order to** check my operations  
**As a** bank client  
**I want to** see the history (operation, date, amount, balance)  of my operations  

# Sample run
```Bank Account Kata 

Transaction history: 
  ID | Date                         | Comments                                           |  Type  |        Value |      Balance |
   1 | Sun Nov 05 17:23:37 CET 2017 | Paycheck                                           | CREDIT |    +5,000.00 |    +5,000.00 |
   2 | Sun Nov 05 17:23:37 CET 2017 | Rent                                               |  DEBIT |    -1,000.00 |    +4,000.00 |
   3 | Sun Nov 05 17:23:37 CET 2017 | Car payment                                        |  DEBIT |      -750.00 |    +3,250.00 |
   4 | Sun Nov 05 17:23:37 CET 2017 | Tax return                                         | CREDIT |    +1,320.00 |    +4,570.00 |
   5 | Sun Nov 05 17:23:37 CET 2017 | Plane ticket                                       |  DEBIT |      -643.25 |    +3,926.75 |
Available balance: 
   +3,926.75```
