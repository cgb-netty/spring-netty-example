package com.github.netty.example.rpc;

import com.github.netty.springboot.NettyRpcClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * hello world
 * @author 84215
 */
@NettyRpcClient("github-db-user")//这里的名称会传入NettyRpcLoadBalanced.class的chooseAddress方法,由chooseAddress方法提供IP地址.该方法由消费者自行实现(例如: eureka zokeeper)
@RequestMapping("/helloRpcService")//这里的值要与 生产者(服务端)对应
public interface HelloRpcService {

    /**
     *  hello world
     * @param name
     * @return
     */
    String sayHello(String name);//方法名称与 生产者(服务端)对应

}