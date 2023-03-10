package com.neptune.hello.service;

import com.neptune.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 默认不要放在容器中
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName){
        return helloProperties.getPrefix() + "(>_<)："+userName+" => "+helloProperties.getSuffix();
    }
}
