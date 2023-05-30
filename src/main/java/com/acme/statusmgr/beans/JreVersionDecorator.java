package com.acme.statusmgr.beans;

public class JreVersionDecorator implements ServerStatus {

        private ServerStatus serverStatus;
        public JreVersionDecorator(ServerStatus serverStatus)
        {
            this.serverStatus = serverStatus;
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



