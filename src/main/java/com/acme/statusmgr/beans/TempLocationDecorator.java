package com.acme.statusmgr.beans;

public class TempLocationDecorator implements ServerStatus
{
    private ServerStatus serverStatus;
    private ServerFacadeInterface dataSource;
    public TempLocationDecorator(ServerStatus serverStatus, ServerFacadeInterface dataSource)
    {
        this.serverStatus = serverStatus;
        this.dataSource = dataSource;
    }
    public void setDataSource(ServerFacadeInterface dataSource)
    {
        this.dataSource = dataSource;
    }
    @Override
    public String getContentHeader() {
        return serverStatus.getContentHeader();
    }

    @Override
    public Integer getRequestCost() {
        return serverStatus.getRequestCost() + 29;
    }

    @Override
    public String getStatusDesc() {
        return serverStatus.getStatusDesc() + ", and the server's temp file location is " + dataSource.getTempLocation();
    }

    @Override
    public long getId() {
        return serverStatus.getId();
    }

}


