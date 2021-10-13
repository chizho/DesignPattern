package com.awei.principle.ocp;


/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 17:26
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}
//绘图类
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
abstract class Shape {
    int m_type;
    public abstract void draw();
}


