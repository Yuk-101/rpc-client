package com.yuk.rpc.client;

import com.yuk.rpc.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yuk on 2019/6/11.
 */
public class RemoteInvocationHandler implements InvocationHandler{

    private String host;
    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        //请求会进入这个方法
        System.out.println("come in");

        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParameters(args);
        RpcNetTransport rpcNetTransport = new RpcNetTransport(host,port);
        Object result = rpcNetTransport.send(rpcRequest);

        return result;
    }
}
