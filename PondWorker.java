public class PondWorker implements Runnable{
    @Override
    public void run() {
        Turtle pond = new Turtle(0,75);
        pond.penColor("brown");
        pond.right(45);
        pond.forward(110);
        pond.left(90);
        pond.forward(5);
        pond.left(90);
        pond.forward(110);
        pond.penColor("pink");
        pond.forward(122);
        pond.penColor("brown");
        pond.forward(25);
        pond.left(90);
        pond.forward(5);
        pond.left(90);
        pond.forward(27);
        pond.backward(27);
        pond.penColor("white");
        pond.left(45);
        pond.backward(15);
        pond.right(45);
        pond.backward(30);
        pond.left(45);
        pond.forward(18);
        pond.left(90);
        pond.forward(18);
        pond.right(135);
        pond.forward(30);
        pond.right(45);
        pond.forward(18);
        pond.left(45);
        pond.backward(28);

    }
}
