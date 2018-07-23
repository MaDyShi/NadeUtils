package com.nade.utils;

public class AppInfo {


    /**
     * data : {"configuration":{"androidVersion":"14","appChannel":1,"appIsAppreciate":0,"appIsForceUpgrade":0,"configCreateTime":1513392255000,"configUpdateTime":1524276953000,"identifier":"be5e0323a9195ade5f56695ed9f2eb6b036f3e6417115d0cbe2fb9d74d8740406838dc84f152014b39a2414fb3530a40bc028a9e87642bd03cf5c36a1f70801e\r\n","iosVersion":"1.9.5"}}
     * status : 1
     */

    private DataBean data;
    private int status;

    @Override
    public String toString() {
        return "AppInfo{" +
                "data=" + data +
                ", status=" + status +
                '}';
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * configuration : {"androidVersion":"14","appChannel":1,"appIsAppreciate":0,"appIsForceUpgrade":0,"configCreateTime":1513392255000,"configUpdateTime":1524276953000,"identifier":"be5e0323a9195ade5f56695ed9f2eb6b036f3e6417115d0cbe2fb9d74d8740406838dc84f152014b39a2414fb3530a40bc028a9e87642bd03cf5c36a1f70801e\r\n","iosVersion":"1.9.5"}
         */

        private ConfigurationBean configuration;

        @Override
        public String toString() {
            return "DataBean{" +
                    "configuration=" + configuration +
                    '}';
        }

        public ConfigurationBean getConfiguration() {
            return configuration;
        }

        public void setConfiguration(ConfigurationBean configuration) {
            this.configuration = configuration;
        }

        public static class ConfigurationBean {
            /**
             * androidVersion : 14
             * appChannel : 1
             * appIsAppreciate : 0
             * appIsForceUpgrade : 0
             * configCreateTime : 1513392255000
             * configUpdateTime : 1524276953000
             * identifier : be5e0323a9195ade5f56695ed9f2eb6b036f3e6417115d0cbe2fb9d74d8740406838dc84f152014b39a2414fb3530a40bc028a9e87642bd03cf5c36a1f70801e

             * iosVersion : 1.9.5
             */

            private String androidVersion;
            private int appChannel;
            private int appIsAppreciate;
            private int appIsForceUpgrade;
            private long configCreateTime;
            private long configUpdateTime;
            private String identifier;
            private String iosVersion;

            @Override
            public String toString() {
                return "ConfigurationBean{" +
                        "androidVersion='" + androidVersion + '\'' +
                        ", appChannel=" + appChannel +
                        ", appIsAppreciate=" + appIsAppreciate +
                        ", appIsForceUpgrade=" + appIsForceUpgrade +
                        ", configCreateTime=" + configCreateTime +
                        ", configUpdateTime=" + configUpdateTime +
                        ", identifier='" + identifier + '\'' +
                        ", iosVersion='" + iosVersion + '\'' +
                        '}';
            }

            public String getAndroidVersion() {
                return androidVersion;
            }

            public void setAndroidVersion(String androidVersion) {
                this.androidVersion = androidVersion;
            }

            public int getAppChannel() {
                return appChannel;
            }

            public void setAppChannel(int appChannel) {
                this.appChannel = appChannel;
            }

            public int getAppIsAppreciate() {
                return appIsAppreciate;
            }

            public void setAppIsAppreciate(int appIsAppreciate) {
                this.appIsAppreciate = appIsAppreciate;
            }

            public int getAppIsForceUpgrade() {
                return appIsForceUpgrade;
            }

            public void setAppIsForceUpgrade(int appIsForceUpgrade) {
                this.appIsForceUpgrade = appIsForceUpgrade;
            }

            public long getConfigCreateTime() {
                return configCreateTime;
            }

            public void setConfigCreateTime(long configCreateTime) {
                this.configCreateTime = configCreateTime;
            }

            public long getConfigUpdateTime() {
                return configUpdateTime;
            }

            public void setConfigUpdateTime(long configUpdateTime) {
                this.configUpdateTime = configUpdateTime;
            }

            public String getIdentifier() {
                return identifier;
            }

            public void setIdentifier(String identifier) {
                this.identifier = identifier;
            }

            public String getIosVersion() {
                return iosVersion;
            }

            public void setIosVersion(String iosVersion) {
                this.iosVersion = iosVersion;
            }
        }
    }
}
