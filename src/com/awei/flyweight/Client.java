package com.awei.flyweight;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 13:21
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("张三"));

        //客户要一个以博客形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("李四"));

        //客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("王五"));

        //客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("赵六"));
        System.out.println("网站的分类共 = "+factory.getWebSiteCount());
    }
}
