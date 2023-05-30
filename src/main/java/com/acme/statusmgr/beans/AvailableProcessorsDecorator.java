package com.acme.statusmgr.beans;

public class AvailableProcessorsDecorator extends ServerStatus{
    private ServerStatus serverStatus;
    public AvailableProcessorsDecorator(ServerStatus serverStatus)
    {
        this.serverStatus = serverStatus;
    }
    @Override
    public String getContentHeader() {
        return serverStatus.getContentHeader();
    }

    @Override
    public Integer getRequestCost() {
        return serverStatus.getRequestCost() + 3;
    }

    @Override
    public String getStatusDesc() {
        return serverStatus.getStatusDesc() + ", and there are " + Runtime.getRuntime().availableProcessors()
                + " processors available";
    }


    @Override
    public long getId() {
        return serverStatus.getId();
    }

}
