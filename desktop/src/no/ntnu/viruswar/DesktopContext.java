package no.ntnu.viruswar;


import no.ntnu.viruswar.services.backend.BackendService;
import no.ntnu.viruswar.services.backend.model.BaseEntity;
import no.ntnu.viruswar.services.backend.model.Loot;
import no.ntnu.viruswar.services.backend.BackendModel;
import no.ntnu.viruswar.services.backend.model.Player;

class DesktopBackendService implements BackendService {


    @Override
    public void startGame(String gamePin) {

    }

    @Override
    public void setEntityAliveState(String gamePin, BaseEntity entity, boolean state) {

    }

    @Override
    public void addEntityToGame(String gamePin, BaseEntity entity) {

    }

    @Override
    public void setLobbyStateListener(BackendModel dataHolder, String gamePin) {

    }

    @Override
    public void setGamePinEventListener(BackendModel dataHolder) {

    }

    @Override
    public void addPlayerToGame(String gamePin, Player player) {

    }

    @Override
    public void updatePlayerPosition(String gamePin, String playerId, float x, float y, float points) {

    }

    @Override
    public void removePlayerFromGame(String gamePin, String playerId) {

    }

    @Override
    public void setPlayersEventListener(BackendModel dataHolder, String gamePin) {

    }

    @Override
    public void addLootToGame(String gamePin, Loot loot) {

    }

    @Override
    public void removeLootFromGame(String gamePin, String lootId) {

    }

    @Override
    public void setLootEventListener(BackendModel dataHolder, String gamePin) {

    }
}

