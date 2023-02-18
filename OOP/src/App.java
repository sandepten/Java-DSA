public class App {
    public static void main(String[] args) throws Exception {
        Pen p1 = new Pen();
        p1.setColor("Black");
        p1.setTip(1);
        System.out.println("Pen color: " + p1.color + ", " + "Pen tip: " + p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}