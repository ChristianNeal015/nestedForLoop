package nestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int LeftOuterLoop  = 0; LeftOuterLoop < 3; LeftOuterLoop++){
            for(int rightOuterLoop = 0; rightOuterLoop < 3; rightOuterLoop++){
                System.out.println(LeftOuterLoop + " " + rightOuterLoop);
            }
        }
    }
}
