package com.acme.statusmgr.beans;

public interface ServerFacadeInterface {
    public String getAvailableProcessers();
    public String getFreeJVMemory();
    public String getJre();
    public String getTotalMemory();
    public String getTempLocation();
}
