package com.atguigu.springcloud.backlist;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:23
 **/
public class PliceyHandlerAdapter {

    private List<PliceyHandler> pliceyHandlerList;

    public List<PliceyHandler>  fingdHandler(Object o, Strategy strategy){
        return pliceyHandlerList.stream().filter(h -> h.match(strategy))

                .collect(Collectors.toList());
    }


}