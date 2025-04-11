package skeleton_java;
public abstract class Component {

    
    // individual component attributes
    String componentName;
    float weight;
    float volume;


    // component constructor - abstract, so should be calling super() in concrete classes
    public Component(String componentName, float weight, float volume) {
        this.componentName = componentName;
        this.weight = weight;
        this.volume = volume;
    }


    // * Visitor: for implementing new methods required across-the-board 
    interface Visitor<R> { R VisitNoseCone(NoseCone nosecone); }
    abstract <R> R accept(Visitor<R> visitor);


    // Nosecone example component
    public static class NoseCone extends Component {

        // attributes and more logic probably imported from other component class files
        public NoseCone(String componentName, float weight, float volume) {
            super(componentName, weight, volume);
        }

        // Visitor: sends data of NoseCone object to the interface, implemented by Rocket
        @Override
        <R> R accept(Component.Visitor<R> visitor) {
            return visitor.VisitNoseCone(this);
        }

    }

}
