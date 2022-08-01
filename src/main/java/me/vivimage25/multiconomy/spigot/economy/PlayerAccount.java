package me.vivimage25.multiconomy.spigot.economy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerAccount {
    
    private final UUID playerUUID;
    private final List<AccountBalance> balanceList;
    
    private PlayerAccount(UUID _playerUUID) {
        playerUUID = _playerUUID;
        balanceList = new ArrayList<>();
    }
    
}
