package com.awei.uml.composition;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/12 14:40
 */
//电脑类
public class Computer {

    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

//鼠标类
class Mouse{}

//显示器类
class Monitor{}