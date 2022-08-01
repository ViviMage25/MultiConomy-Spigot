package me.vivimage25.multiconomy.spigot.economy;

public class AccountBalance {
    
    private final String currencyName;
    private Double balance;

    protected AccountBalance(String _currencyName) {
        currencyName = _currencyName.strip().toLowerCase();
    }
    
    public Currency getCurrency() {
        return Currency.getCurrency(currencyName);
    }
    
    public String getCurrencyName() {
        return currencyName;
    }
    
    public Double getBalance() {
        return balance;
    }
    
    public Double getBalanceValue() {
        return balance * getCurrency().getValue();
    }
    
    public void changeBalance(double _delta) {
        setBalance(getBalance() * _delta);
    }
    
    public void changeBalanceByValue(double _delta) {
        setBalance(getBalance() * (_delta / getCurrency().getValue()));
    }
    
    public void setBalance(double _value) {
        balance = _value;
    }
    
    public void setBalanceByValue(double _value) {
        balance = (_value / getCurrency().getValue());
    }
    
}
