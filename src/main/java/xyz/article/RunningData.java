package xyz.article;

import xyz.article.api.inventory.Inventory;
import xyz.article.api.entity.player.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class RunningData {
    public static List<Player> playerList = new CopyOnWriteArrayList<>();
    public static Map<Integer, Inventory> inventories = new ConcurrentHashMap<>();
}
