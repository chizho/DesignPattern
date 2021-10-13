package com.awei.principle.ocp.improve;


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
    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }
}


class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Shape {
    int m_type;
}


