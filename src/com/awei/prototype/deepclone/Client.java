package com.awei.prototype.deepclone;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/14 10:52
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("宋江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "大牛的类"));

        //方式一完成深拷贝
//        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
//        System.out.println("deepProtoType.name= "+deepProtoType.getName()+"; deepProtoType.deepCloneableTarget= "+deepProtoType.getDeepCloneableTarget().hashCode());
//        System.out.println("deepProtoType1.name= "+deepProtoType1.getName()+"; deepProtoType1.deepCloneableTarget= "+deepProtoType1.getDeepCloneableTarget().hashCode());

        //方式二 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println("deepProtoType.name= "+deepProtoType.getName()+"; deepProtoType.deepCloneableTarget= "+deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name= "+p2.getName()+"; p2.deepCloneableTarget= "+p2.getDeepCloneableTarget().hashCode());

    }
}
