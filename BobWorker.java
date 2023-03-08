public class BobWorker implements Runnable{

    @Override
    public void run() {
        Turtle bob = new Turtle();
        bob.penColor("red");
        bob.speed(0.15);
        bob.left(140);
        bob.forward(113);
        for(int i=0;i<200;i++){
            bob.right(1);
            bob.forward(1);
        }
        bob.left(120);

        for(int i=0;i<200;i++){
            bob.right(1);
            bob.forward(1);
        }

        bob.forward(113);
    }
}
