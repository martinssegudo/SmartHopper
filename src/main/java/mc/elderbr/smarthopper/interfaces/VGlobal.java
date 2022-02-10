package mc.elderbr.smarthopper.interfaces;

import mc.elderbr.smarthopper.model.Grupo;
import mc.elderbr.smarthopper.model.Item;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VGlobal {

    // ITEM
    Map<Integer, Item> ITEM_ID_MAP = new HashMap<>();
    Map<String, Item> ITEM_NAME_MAP = new HashMap<>();
    List<Item> LIST_ITEM = new ArrayList<>();

    // GRUPO
    List<Grupo> LIST_GRUPO = new ArrayList<>();
    List<Material> LIST_MATERIAL = new ArrayList<>();


    Plugin SMARTHOPPER = Bukkit.getServer().getPluginManager().getPlugin("SmartHopper");
    String VERSION = VGlobal.SMARTHOPPER.getDescription().getVersion();

    File ARQUIVO = Bukkit.getServer().getPluginManager().getPlugin("SmartHopper").getDataFolder().getAbsoluteFile();

}
