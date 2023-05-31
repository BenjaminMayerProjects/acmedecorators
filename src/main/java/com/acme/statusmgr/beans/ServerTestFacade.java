package com.acme.statusmgr.beans;
/**
 * ServerTestFacade helps us test our code by giving us constant values to check whether our decorators
 * are working as they should along with the general functioning of our program.
 *
 *
 */
public class ServerTestFacade implements ServerFacadeInterface{
    public String getAvailableProcessors()
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
