package SkeletonJava;

abstract public class ComponentFactory {

    public static class NoseConeFactory extends ComponentFactory {
        
        public Component.NoseCone createComponent(String componentname, String name, double mass, double volume) {
            return new Component.NoseCone(componentname,name,mass,volume);
        }
    }

    public static class EngineFactory extends ComponentFactory {

        public Component createComponent(String componentname, String name, double mass, double volume, double horsepower) {
            return new Component.Engine(componentname,name,mass,volume,horsepower);
        }
    }

    // commented edits for new factory-update branch

}
