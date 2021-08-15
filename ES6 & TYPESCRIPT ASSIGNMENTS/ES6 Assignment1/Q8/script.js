"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, Name, balance) {
        this.id = id;
        this.Name = Name;
        this.balance = balance;
    }
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, Name, balance, interest) {
        var _this = _super.call(this, id, Name, balance) || this;
        _this.interest = interest;
        return _this;
    }
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, Name, balance, cash_credit) {
        var _this = _super.call(this, id, Name, balance) || this;
        _this.cash_credit = cash_credit;
        return _this;
    }
    return CurrentAccount;
}(Account));
var totalBalance = function (accNo) {
    var bal = 0;
    for (var _i = 0, accNo_1 = accNo; _i < accNo_1.length; _i++) {
        var account = accNo_1[_i];
        bal += account.balance;
    }
    console.log("Total balance in the bank is: " + bal);
};
var s1 = new SavingAccount(101, "An", 200, 30);
var s2 = new SavingAccount(102, "A", 100, 50);
var c1 = new CurrentAccount(105, "B", 150, 20);
var accNo = [s1, s2, c1];
totalBalance(accNo);
