package com.yuk.rpc.client;

import com.yuk.rpc.RpcRequest;

/**
 * Created by yuk on 2019/6/11.
 */
public class RpcNetTransport {
    private String host;
    private int port;

    public RpcNetTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Object send(RpcRequest rpcRequest){
        return null;
    }
}
