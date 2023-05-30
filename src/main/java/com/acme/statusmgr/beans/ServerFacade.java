package com.acme.statusmgr.beans;

public class ServerFacade implements ServerFacadeInterface  {

    @Override
    public String getAvailableProcessers() {
        return String.valueOf(Runtime.getRuntime().availableProcessors());
    }

    @Override
    public String getFreeJVMemory() {
        Long freeMemory = Runtime.getRuntime().freeMemory();
        String stringFreeMemory = freeMemory.toString();
        return stringFreeMemory;
    }

    @Override
    public String getJre() {
        String version = String.valueOf(Runtime.version());
        return version;
    }

    @Override
    public String getTotalMemory() {
        Long totalMemory = Runtime.getRuntime().totalMemory();
        String totalMemoryString = totalMemory.toString();
        return totalMemoryString;
    }

    @Override
    public String getTempLocation() {
        return System.getenv("TEMP");
    }
}
