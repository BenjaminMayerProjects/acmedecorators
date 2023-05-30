package com.acme.statusmgr.beans;

public class ServerTestFacade implements ServerFacadeInterface{
    public String getAvailableProcessers()
    {
        return "4";
    }
    public String getFreeJVMemory()
    {
        return "127268272";
    }
    public String getJre()
    {
        return "15.0.2+7-27";
    }
    public String getTotalMemory()
    {
        return "159383552 ";
    }
    public String getTempLocation()
    {
        return "M:\\\\AppData\\\\Local\\\\Temp";
    }
}
