package com.awei.prototype.deepclone;

import java.io.*;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/14 10:43
 */
public class DeepProtoType implements Serializable, Cloneable {
    private String name; //Sting 属性
    private DeepCloneableTarget deepCloneableTarget; //引用类型

    public DeepProtoType() {
        super();
    }

    //深拷贝 - 方式一：使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型(属性)和String的clone
        deep =super.clone();

        //对引用类型的属性,进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.setDeepCloneableTarget((DeepCloneableTarget) deepCloneableTarget.clone());
        return deepProtoType;
    }

    //深拷贝 - 方式二：通过对象的序列化实现（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (DeepProtoType) ois.readObject();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }
}
