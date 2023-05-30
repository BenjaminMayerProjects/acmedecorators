package com.acme.statusmgr.beans;

public class TotalMemoryDecorator extends ServerStatus {
    private ServerStatus serverStatus;
    public TotalMemoryDecorator(ServerStatus serverStatus)
    {
        this.serverStatus = serverStatus;
    }

    public String getContentHeader() {
        return serverStatus.getContentHeader();
    }


    public Integer getRequestCost() {
        return serverStatus.getRequestCost();// + 13;
    }


    public String getStatusDesc() {
        return serverStatus.getStatusDesc() + " and there are " + Runtime.getRuntime().freeMemory() +
                " bytes of JVM memory free";
    }


    public long getId() {
        return serverStatus.getId();
    }

}
