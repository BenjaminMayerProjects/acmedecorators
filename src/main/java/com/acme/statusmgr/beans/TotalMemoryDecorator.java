package com.acme.statusmgr.beans;

public class TotalMemoryDecorator extends ServerStatus {
    private ServerStatus serverStatus;
    public TotalMemoryDecorator(ServerStatus serverStatus)
    {
        this.serverStatus = serverStatus;
    }
    @Override
    public String getContentHeader() {
        return serverStatus.getContentHeader();
    }

    @Override
    public Integer getRequestCost() {
        return serverStatus.getRequestCost() + 13;
    }

    @Override
    public String getStatusDesc() {
        return serverStatus.getStatusDesc() + " and there are " + Runtime.getRuntime().freeMemory() +
                " bytes of JVM memory free";
    }

    @Override
    public long getId() {
        return serverStatus.getId();
    }

}
