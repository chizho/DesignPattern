package com.awei.proxy.staticproxy;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 14:32
 */
//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao {
    private TeacherDao target;//目标对象,通过接口聚合

    //构造器
    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理......");
        target.teach();
        System.out.println("提交......");
    }
}
