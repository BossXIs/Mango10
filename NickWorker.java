public class NickWorker implements Runnable{
    @Override
    public void run() {
        Turtle nick = new Turtle(0,75);
        nick.penColor("brown");
        nick.right(45);
        nick.forward(110);
        nick.penColor("white");
        nick.right(90);
        nick.forward(25);
        nick.left(135);
        nick.forward(36);
        nick.left(90);
        nick.forward(36);
        nick.left(135);
        nick.forward(25);
    }
}
