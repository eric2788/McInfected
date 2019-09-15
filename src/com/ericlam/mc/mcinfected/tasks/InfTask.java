package com.ericlam.mc.mcinfected.tasks;

import com.ericlam.mc.mcinfected.config.InfConfig;
import com.ericlam.mc.mcinfected.main.McInfected;
import com.ericlam.mc.minigames.core.SectionTask;
import com.ericlam.mc.minigames.core.manager.PlayerManager;

public abstract class InfTask implements SectionTask {

    protected PlayerManager playerManager;
    protected McInfected mcinf;
    protected InfConfig infConfig;
    private boolean running;

    public InfTask() {
        this.running = false;
        this.mcinf = McInfected.getPlugin(McInfected.class);
        this.infConfig = mcinf.getConfigManager().getConfigAs(InfConfig.class);
    }

    @Override
    public void initTimer(PlayerManager playerManager) {
        this.playerManager = playerManager;
        this.initRun(playerManager);
    }

    public abstract void initRun(PlayerManager playerManager);


    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void setRunning(boolean running) {
        this.running = running;
    }
}
