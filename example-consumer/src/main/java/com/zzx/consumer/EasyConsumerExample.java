package com.zzx.consumer;

import com.zzx.example.common.service.UserService;
import com.zzx.example.common.model.User;
import com.zzx.zzxrpc.proxy.ServiceProxyFactory;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 16:53
 * @Description: com.zzx.consumer
 * @version: 1.0
 */
public class EasyConsumerExample {
    public static void main(String[] args) {

        //静态代理
//        UserService userService = new UserServiceProxy();

        //动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user =new User();
        user.setName("zzx");
        //调用
        User newUser = userService.getUser(user);
        if(newUser != null){
            System.out.println(newUser.getName());
        }else {
            System.out.println("user == null");
        }

    }
}
