package SkeletonJava;
import SkeletonJava.ComponentFactory.*;
import SkeletonJava.Component.*;
import java.util.*;

public class Rocket implements Component.Visitor<Object> {

    Map<String,Object> components = new HashMap<>();

    @Override // visitor method for some functionality for nose cone
    public Object VisitNoseCone(NoseCone nosecone) {System.out.println("from visitor in nose cone"); return this;}
    @Override // visitor method for some functionality for engine
    public Object VisitEngine(Engine engine) {System.out.println("from visitor in engine"); return this;}


    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        NoseConeFactory noseConeFactory = new NoseConeFactory();
        NoseCone newNoseCone = noseConeFactory.createComponent("nosecone","newNoseCode",1.0,12.0);

        rocket.components.put(newNoseCone.componentName,newNoseCone);
        
        System.out.println(newNoseCone.toString());
        newNoseCone.accept(rocket);
    }

}
