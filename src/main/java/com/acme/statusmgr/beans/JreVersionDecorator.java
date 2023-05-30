package com.acme.statusmgr.beans;

public class JreVersionDecorator implements ServerStatus {

        private ServerStatus serverStatus;
        private ServerFacadeInterface dataSource;
        public JreVersionDecorator(ServerStatus serverStatus, ServerFacadeInterface dataSource)
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
            return serverStatus.getRequestCost() ;//+ 19;
        }

        @Override
        public String getStatusDesc() {
            return serverStatus.getStatusDesc() + ", and the JRE version is " + Runtime.version();
        }


        @Override
        public long getId() {
            return serverStatus.getId();
        }

    }



