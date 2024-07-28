package app;

@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);

    MathOperation mathOperation = new MathOperation() {
        @Override
        public int operate(int a, int b) {
            return (a + b);
        }
    };
}