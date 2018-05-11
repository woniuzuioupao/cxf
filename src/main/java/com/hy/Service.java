package com.hy;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * Created by hany on 2018/5/11.
 */
public class Service {
    public void publish(){
        System.out.println("service is start:");
        /*HelloCXFImpl helloCXF=new HelloCXFImpl();
        String address="http://localhost:8888/HelloCXF";
        Endpoint.publish(address,helloCXF);*/
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloCXF.class);
        factory.setAddress("http://localhost:8888/HelloCXF");
        Server server = factory.create();
        server.start();
    };
}
