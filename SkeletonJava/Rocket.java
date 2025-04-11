package SkeletonJava;
// import skeleton_java.Component.*;
// import skeleton_java.ComponentFactory.*;

public class Rocket implements Component.Visitor<Object> {

    int componentNumber = 4;
    Component[] components = new Component[this.componentNumber];

    @Override
    public Object VisitNoseCone(Component.NoseCone nosecone) {
        return this;
    }
    @Override
    public Object VisitEngine(Component.Engine engine) {
        return this;
    }


    public static void main(String[] args) {
        ComponentFactory noseConeFactory = new ComponentFactory.NoseConeFactory();
        Component newNoseCone = noseConeFactory.createComponent();
        System.out.println(newNoseCone.toString());
    }

}
