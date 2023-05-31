package com.acme.statusmgr.beans;

public class TotalMemoryDecorator implements ServerStatus {
    private ServerStatus serverStatus;
    private ServerFacadeInterface dataSource;
    public TotalMemoryDecorator(ServerStatus serverStatus, ServerFacadeInterface dataSource)
    {
        this.serverStatus = serverStatus;
        this.dataSource =dataSource;
    }
    public void setDataSource(ServerFacadeInterface dataSource)
    {
        this.dataSource = dataSource;
    }

    public String getContentHeader() {
        return serverStatus.getContentHeader();
    }


    public Integer getRequestCost() {
        return serverStatus.getRequestCost() + 13;
    }


    public String getStatusDesc() {
        return serverStatus.getStatusDesc() + ", and there is a total of " + dataSource.getTotalMemory() +
                "bytes of JVM memory";
    }


    public long getId() {
        return serverStatus.getId();
    }

}
