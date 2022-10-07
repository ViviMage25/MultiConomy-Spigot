package me.vivimage25.multiconomy.spigot.utility;

import me.vivimage25.multiconomy.spigot.economy.Currency;
import org.bukkit.configuration.file.YamlConfiguration;

public class MultiConomyConfig {
    
    private static String _defaultCurrencyName = "_default";
    private static String[] _defaultCurrencyDesc = {"Default Currency"};
    private static char _defaultCurrencySymbol = '$';
    private static double _defaultCurrencyValue = 1.0D;
    
    public static String getDefaultCurrencyName() {
        return _defaultCurrencyName;
    }
    
    public static String[] getDefaultCurrencyDesc() {
        return _defaultCurrencyDesc;
    }
    
    public static char getDefaultCurrencySymbol() {
        return _defaultCurrencySymbol;
    }
    
    public static double getDefaultCurrencyValue() {
        return _defaultCurrencyValue;
    }
    
    public static void setDefaultCurrency(String _name, char _symbol, double _value, String... _description) {
        setDefaultCurrency(Currency.createNewCurrency(_name, _symbol, _value, _description));
    }
    
    public static void setDefaultCurrency(Currency _defaultCurrency) {
        _defaultCurrencyName = _defaultCurrency.getName();
        _defaultCurrencySymbol = _defaultCurrency.getSymbol();
        _defaultCurrencyValue = _defaultCurrency.getValue();
        _defaultCurrencyDesc = _defaultCurrency.getDescription();
    }
    
    private YamlConfiguration config;
    
    public MultiConomyConfig() {}
    
    public void loadConfig(String _filename) {
        
    }
    
}
