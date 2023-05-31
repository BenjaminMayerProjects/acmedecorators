package com.acme.statusmgr.beans;
/**
 * The ServerFacadeInterface is designed to allow different kinds of response to be given by StatusController.
 * This is, at the moment, limited to the functionality of having constant input being given back when we want to
 * test the logic of the system in our tests, but potentially this can be expanded in the future to
 * include other ways of getting the information. ALl forms of information are returned as Strings for
 * simplicity.
 */
public interface ServerFacadeInterface {
    public String getAvailableProcessors();
    public String getFreeJVMemory();
    public String getJre();
    public String getTotalMemory();
    public String getTempLocation();
}
