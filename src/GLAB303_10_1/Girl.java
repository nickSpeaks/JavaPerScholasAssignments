package bootcamp10.Assignments.GLAB303_10_1;

public class Girl extends Person {
    static double ageFactor = 1.3;
    public Girl(String aName) {
        name = "Ms. " + aName;
    }
}

public String talk() {
    return ("Hello " + jump());
}

public String jump() {
    return ("I am jumping.");
}

public void main() {
}

//public static double lifeSpan() {
//    return(lifeSpan * ageFactor));
//}

// java: implicitly declared classes are a preview feature and are disabled by default.