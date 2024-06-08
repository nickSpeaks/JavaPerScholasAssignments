package bootcamp10.Assignments.GLAB303_10_4;

public interface Movable {
    // An interface defines a list of public abstract
    // methods to be implemented by teh subclass

    void moveUp();      // // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
