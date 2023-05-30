package com.acme.statusmgr.beans;

public class ServerFacade   {
    private ServerStatus serverStatus;
    public ServerFacade(ServerStatus serverStatus)
    {
        this.serverStatus = serverStatus;
    }
    public ServerFacade(long id, String contentHeader)
    {
        this.serverStatus = new BaseServerStatus(id, contentHeader);
    }
    public void addAvailableProcessers()
    {
        serverStatus = new AvailableProcessorsDecorator(serverStatus);
    }
    public void addFreeJVMMemory()
    {
        serverStatus = new FreeJVMMemoryDecorator(serverStatus);
    }
    public void addJreVersion()
    {
        serverStatus = new JreVersionDecorator(serverStatus);
    }
    public void addTempLocation()
    {
        serverStatus = new TempLocationDecorator(serverStatus);
    }
    public void addTotalMemory()
    {
        serverStatus = new TotalMemoryDecorator(serverStatus);
    }


}
