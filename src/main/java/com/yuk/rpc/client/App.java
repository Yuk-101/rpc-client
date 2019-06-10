package com.yuk.rpc.client;

import com.yuk.rpc.IHelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        IHelloService iHelloService = rpcProxyClient.clientProxy(IHelloService.class,"localhost",8080);

        String result = iHelloService.sayHello("Yuk");
        System.out.println(result);
    }
}
