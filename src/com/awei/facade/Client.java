package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 11:00
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("-----------准备-----------");
        homeTheaterFacade.ready();
        System.out.println("-----------播放-----------");
        homeTheaterFacade.play();
        System.out.println("-----------暂停-----------");
        homeTheaterFacade.pause();
        System.out.println("-----------关闭-----------");
        homeTheaterFacade.end();
    }
}
