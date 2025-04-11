package SkeletonJava;
public abstract class Component {
    
    // individual component attributes
    String name;
    float mass;
    float volume;


    // component constructor - abstract, so should be calling super() in concrete classes
    public Component(String name, float mass, float volume) {
        this.name = name;
        this.mass = mass;
        this.volume = volume;
    }


    // singular toString() method for testing
    public String toString() {
        return (this.name + " has mass " + this.mass + "KGs." );
    }


    // * Visitor: for implementing new methods required across-the-board 
    interface Visitor<R> {
        R VisitNoseCone(NoseCone nosecone);
        R VisitEngine(Engine engine);
    }
    abstract <R> R accept(Visitor<R> visitor);


    // Nosecone example component
    public static class NoseCone extends Component {

        // attributes and more logic probably imported from other component class files
        public NoseCone(String name, float mass, float volume) {
            super(name, mass, volume);
        }

        // example method
        public String toString() {
            return "this is a nose cone";
        }

        // Visitor: sends data of NoseCone object to the interface, implemented by Rocket
        @Override
        <R> R accept(Component.Visitor<R> visitor) {
            return visitor.VisitNoseCone(this);
        }

    }


    // Engine example component
    public static class Engine extends Component {

        // attributes and more logic probably imported from other component class files
        public Engine(String name, float mass, float volume) {
            super(name, mass, volume);
        }

        // example method
        public String toString() {
            return "this is an engine";
        }

        // Visitor: sends data of NoseCone object to the interface, implemented by Rocket
        @Override
        <R> R accept(Component.Visitor<R> visitor) {
            return visitor.VisitEngine(this);
        }

    }

}
