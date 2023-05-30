package com.acme.statusmgr.beans;

public class FreeJVMMemoryDecorator implements ServerStatus {

        private ServerStatus serverStatus;
        private ServerFacadeInterface dataSource;

        public FreeJVMMemoryDecorator(ServerStatus serverStatus, ServerFacadeInterface dataSource)
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
            return serverStatus.getRequestCost();//+ 7;
        }

        @Override
        public String getStatusDesc() {
            return serverStatus.getStatusDesc() + ", and there are " + dataSource.getFreeJVMemory() +
                    " bytes of JVM memory free";
        }


        @Override
        public long getId() {
            return serverStatus.getId();
        }

    }





