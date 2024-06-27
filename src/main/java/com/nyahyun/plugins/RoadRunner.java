package com.nyahyun.plugins;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RoadRunner extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
    }

//    @EventHandler
//    public void onPlayerMove(PlayerMoveEvent event) {
//        Player player = event.getPlayer();
//        if (!player.isSprinting()) {
//            return;
//        }
//        Location from = event.getFrom();
//        Location to = event.getTo();
//
//        //double speedCorrectionX = (to.getX() - from.getX()) * 1.428;
//        //double speedCorrectionZ = (to.getZ() - from.getZ()) * 1.428;
//
//        double speedCorrectionX = (to.getX() - from.getX()) * 5;
//        double speedCorrectionZ = (to.getZ() - from.getZ()) * 5;
//
//        to.setX(from.getX() + speedCorrectionX);
//        to.setZ(from.getZ() + speedCorrectionZ);
//
//    }

    @EventHandler
    public void onPlayerToggleSprint(PlayerToggleSprintEvent event) {
        Player player = event.getPlayer();
        //getLogger().info(Boolean.valueOf(event.isSprinting()).toString());
        if (event.isSprinting()) {
            player.setWalkSpeed(0.4f);
       } else {
            player.setWalkSpeed(0.2f);
        }
        //getLogger().info((Float.valueOf(event.getPlayer().getWalkSpeed())).toString());
//        float playerDefaultWalk = player.getWalkSpeed();

    }
}