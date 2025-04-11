package skeleton_java;
import skeleton_java.Component.NoseCone;

public class Rocket implements Component.Visitor<Object> {

    // hold components together within a dictionary
    @Override
    public Object VisitNoseCone(NoseCone nosecone) {
        return this;
    }

}
