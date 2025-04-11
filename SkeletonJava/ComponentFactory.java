package SkeletonJava;

abstract public class ComponentFactory {

    public abstract Component createComponent();

    public static class NoseConeFactory extends ComponentFactory {
        
        @Override
        public Component.NoseCone createComponent() {
            return new Component.NoseCone(null,0,0);
        }
    }

    public static class EngineFactory extends ComponentFactory {
        @Override
        public Component createComponent() {
            return new Component.Engine(null,0,0);
        }
    }

}
