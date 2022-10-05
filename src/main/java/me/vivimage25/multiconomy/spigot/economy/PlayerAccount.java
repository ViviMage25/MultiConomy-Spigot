package me.vivimage25.multiconomy.spigot.economy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerAccount extends Account {
    
    private final UUID playerUUID;
    private final List<AccountBalance> balanceList;
    
    private PlayerAccount(UUID _playerUUID) {
        playerUUID = _playerUUID;
        balanceList = new ArrayList<>();
    }
    
    @Override
    public AccountBalance getAccountBalance(String _currencyName) {
        for(AccountBalance bal : balanceList) {
            if(bal.getCurrencyName.equals(_currencyName)) {
                return bal;
            }
        }
        return null;
    }
    
}
