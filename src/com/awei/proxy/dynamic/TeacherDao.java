package com.awei.proxy.dynamic;


/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 14:32
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师授课中....");
    }
}
