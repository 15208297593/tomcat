package com.utils;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CounterListener  implements HttpSessionListener{
    public static int count;
    public CounterListener(){
        count = 0;
    }
    //创建一个session时激发
    public void sessionCreated(HttpSessionEvent arg0) {
        count++;
    }

    //一个session失效时激发
    public void sessionDestroyed(HttpSessionEvent arg0) {
        if(count>0) count--;
    }

}
