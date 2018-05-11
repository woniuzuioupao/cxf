package com.hy.client;

import com.hy.HelloCXF;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by hany on 2018/5/11.
 */
public class client {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(HelloCXF.class);
        svr.setAddress("http://localhost:8888/HelloCXF");
        HelloCXF helloCXF = (HelloCXF) svr.create();
        System.out.println(helloCXF.sayHi("CXF-HANYAN"));
    }
}
