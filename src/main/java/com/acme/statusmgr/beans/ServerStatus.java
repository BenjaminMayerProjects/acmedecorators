package com.acme.statusmgr.beans;
/**
 * Our root class. We have refactored the ServerStatus class to be an interface instead, with the
 * various fields and information the server provides being altered if and as needed by the various decorators.
 *
 */
public interface ServerStatus {
    ServerFacadeInterface dataSource = null;
    String getContentHeader();
    Integer getRequestCost();
    String getStatusDesc();
    long getId();




}
