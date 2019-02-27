package com.tl;



import java.io.Serializable;

public class TlState  implements Serializable{
    /**
     * ip地址
     */
    private String ip;
    /**
     * server名称
     */
    private String serverName;
    /**
     * 端口号
     */
    private String port;
    /**
     * 状态
     */
    private String status;
    /**
     * 客户端名称
     */
    private String  clientName;
    /**
     * node值
     */
    private String node;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
