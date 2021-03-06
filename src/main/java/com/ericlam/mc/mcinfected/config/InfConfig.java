package com.ericlam.mc.mcinfected.config;

import com.hypernite.mc.hnmc.core.config.yaml.Configuration;
import com.hypernite.mc.hnmc.core.config.yaml.Resource;
import org.bukkit.Location;

import java.util.Map;

@Resource(locate = "config.yml")
public class InfConfig extends Configuration {

    public Time gameTime;
    public Location lobby;
    public Game game;
    public Map<String, String> defaultKit;
    public double damageMultiplier;
    public String fallbackServer;
    public long compassGivenInSec;
    public Sounds sounds;

    public static class Time {
        public long game;
        public long infecting;
        public long voting;
    }

    public static class Game {
        public float alphaPercent;
        public float hunterPercent;
        public int autoStart;
        public int maxRound;
    }

    public static class Sounds {
        public Map<String, String> skill;
        public Map<String, String> voting;
        public Map<String, String> infecting;
        public Map<String, String> hunter;
        public Map<String, String> game;
        public String compass;
        public String infected;
        public String respawn;
    }

}
