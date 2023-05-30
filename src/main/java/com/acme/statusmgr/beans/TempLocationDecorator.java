package com.acme.statusmgr.beans;

public class TempLocationDecorator implements ServerStatus
{
    private ServerStatus serverStatus;
    public TempLocationDecorator(ServerStatus serverStatus)
    {
        this.serverStatus = serverStatus;
    }
    @Override
    public String getContentHeader() {
        return serverStatus.getContentHeader();
    }

    @Override
    public Integer getRequestCost() {
        return serverStatus.getRequestCost();//+ 29;
    }

    @Override
    public String getStatusDesc() {
        return serverStatus.getStatusDesc() + ", and the server's temp file location is " + System.getenv("TEMP");
    }

    @Override
    public long getId() {
        return serverStatus.getId();
    }

}


