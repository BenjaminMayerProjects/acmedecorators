package com.acme.statusmgr.beans;

public class FreeJVMMemoryDecorator implements ServerStatus {

        private ServerStatus serverStatus;
        public FreeJVMMemoryDecorator(ServerStatus serverStatus)
        {
            this.serverStatus = serverStatus;
        }
        @Override
        public String getContentHeader() {
            return serverStatus.getContentHeader();
        }

        @Override
        public Integer getRequestCost() {
            return serverStatus.getRequestCost();//+ 7;
        }

        @Override
        public String getStatusDesc() {
            return serverStatus.getStatusDesc() + ", and there are " + Runtime.getRuntime().freeMemory() +
                    " bytes of JVM memory free";
        }


        @Override
        public long getId() {
            return serverStatus.getId();
        }

    }





