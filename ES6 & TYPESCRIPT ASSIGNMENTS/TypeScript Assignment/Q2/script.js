"use strict";
class Account {
    constructor(id, Name, balance) {
        this.id = id;
        this.Name = Name;
        this.balance = balance;
    }
}
class SavingAccount extends Account {
    constructor(id, Name, balance, interest) {
        super(id, Name, balance);
        this.interest = interest;
    }
}
class CurrentAccount extends Account {
    constructor(id, Name, balance, cash_credit) {
        super(id, Name, balance);
        this.cash_credit = cash_credit;
    }
}
let totalBalance = function (accNo) {
    let bal = 0;
    for (const account of accNo) {
        bal += account.balance;
    }
    console.log(`Total balance in the bank is: ${bal}`);
};
let s1 = new SavingAccount(101, "An", 200, 30);
let s2 = new SavingAccount(102, "A", 100, 50);
let c1 = new CurrentAccount(105, "B", 150, 20);
let accNo = [s1, s2, c1];
totalBalance(accNo);
