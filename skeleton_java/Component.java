package skeleton_java;
public abstract class Component {

    
    // individual component attributes
    String componentName;
    float mass;
    float volume;


    // component constructor - abstract, so should be calling super() in concrete classes
    public Component(String componentName, float mass, float volume) {
        this.componentName = componentName;
        this.mass = mass;
        this.volume = volume;
    }


    // singular toString() method for testing
    public String toString() {
        return (this.componentName + " has mass " + this.mass + "KGs." );
    }


    // * Visitor: for implementing new methods required across-the-board 
    interface Visitor<R> { R VisitNoseCone(NoseCone nosecone); }
    abstract <R> R accept(Visitor<R> visitor);


    // Nosecone example component
    public static class NoseCone extends Component {

        // attributes and more logic probably imported from other component class files
        public NoseCone(String componentName, float mass, float volume) {
            super(componentName, mass, volume);
        }

        // Visitor: sends data of NoseCone object to the interface, implemented by Rocket
        @Override
        <R> R accept(Component.Visitor<R> visitor) {
            return visitor.VisitNoseCone(this);
        }

    }

}
