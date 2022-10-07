package me.vivimage25.multiconomy.spigot.economy;

import java.util.ArrayList;
import java.util.List;
import me.vivimage25.multiconomy.spigot.utility.MultiConomyConfig;

public class Currency {
    
    private static final List<Currency> CURRENCY_LIST = new ArrayList<>();
    private static final Currency DEFAULT_CURRENCY = new Currency(MultiConomyConfig.getDefaultCurrencyName(), MultiConomyConfig.getDefaultCurrencySymbol(), MultiConomyConfig.getDefaultCurrencyValue(), MultiConomyConfig.getDefaultCurrencyDesc());
    
    public static List<Currency> getCurrencyList() {
        return CURRENCY_LIST;
    }
    
    public static Currency getCurrency(String _name) {
        for(Currency cur : CURRENCY_LIST) {
            if(cur.getName().equals(_name.strip().toLowerCase())) return cur;
        }
        return null;
    }
    
    public static Currency createNewCurrency(String _name, char _symbol, double _value, String... _description) {
        return new Currency(_name, _symbol, _value, _description);
    }
    
    public static boolean addCurrency(String _name, char _symbol, double _value, String... _description) {
        if(getCurrency(_name.strip().toLowerCase()) != null) return false;
        return CURRENCY_LIST.add(new Currency(_name, _symbol, _value, _description));
    }
    
    public static boolean removeCurrency(String _name) {
        Currency result = getCurrency(_name.strip().toLowerCase());
        if(result == null) return false;
        return CURRENCY_LIST.remove(result);
    }
    
    private final String name;
    private final Character symbol;
    private Double value;
    private String[] description;
    
    private Currency(String _name, char _symbol, double _value, String... _description) {
        name = _name.strip().toLowerCase();
        symbol = _symbol;
        setValue(_value);
        setDescription(_description);
    }
    
    public String getName() {
        return name;
    }
    
    public Character getSymbol() {
        return symbol;
    }
    
    public Double getValue() {
        return value;
    }
    
    public String[] getDescription() {
        return description;
    }
    
    public Currency changeValue(double _delta) {
        value += _delta;
        return this;
    }
    
    public final Currency setValue(double _value) {
        value = _value;
        return this;
    }
    
    public final Currency setDescription(String... _description) {
        description = _description;
        return this;
    }
    
}
