package HomeWork.Class25;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("The area of a Circle is the radius powered by 2 x Pi");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("The perimeter of a Circle is the 2 times pi and by the radius");
    }
}

class Square implements Shape {

    @Override
    public void calculateArea() {
        System.out.println("The area of a Square is the length times by width");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("The perimeter of a Square is the length*2 + width*2");
    }
}