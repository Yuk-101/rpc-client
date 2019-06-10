package com.yuk.rpc.client;

import java.lang.reflect.Proxy;

/**
 * Created by yuk on 2019/6/10.
 */
public class RpcProxyClient {
    public <T> T clientProxy(final Class<T> interfaceCls,final String host,final int port){
        return (T)Proxy.newProxyInstance(interfaceCls.getClassLoader(),new Class<?>[]{interfaceCls},new RemoteInvocationHandler(host,port));
    }
}
