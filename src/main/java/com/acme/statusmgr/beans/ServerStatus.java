package com.acme.statusmgr.beans;

public interface ServerStatus {
    ServerFacadeInterface dataSource = null;
    String getContentHeader();
    Integer getRequestCost();
    String getStatusDesc();
    long getId();




}
