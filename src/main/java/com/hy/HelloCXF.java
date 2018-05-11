package com.hy;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by hany on 2018/5/11.
 */
@WebService
public interface HelloCXF {
    String sayHi(@WebParam(name = "text") String  s);
}
