package com.hy;

import javax.jws.WebService;

/**
 * Created by hany on 2018/5/11.
 */
@WebService(endpointInterface = "com.hy.HelloCXF",serviceName = "HelloCXF")
public class HelloCXFImpl implements HelloCXF {

    public String sayHi(String s) {
        return "Hi:"+s;
    }
}
