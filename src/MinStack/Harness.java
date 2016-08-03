package MinStack;

public class Harness {
    public static void main(String[] args) {
        // make a new MinStack
        Harness harness = new Harness();
        harness.testCase1();
        harness.testCase2();
        harness.testCase3();
    }

    private void testCase2() {
        MinStack minStack = new MinStack();
        minStack.minPeek(); // BOOM
    }

    private void testCase1() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        System.out.println(minStack.minPeek()); // 3
        minStack.push(4);
        System.out.println(minStack.minPeek()); // 3
        minStack.push(5);
        System.out.println(minStack.minPeek()); // 3
        minStack.push(2);
        System.out.println(minStack.minPeek()); // 2
        minStack.push(6);
        System.out.println(minStack.minPeek()); // 2
        minStack.push(1);
        System.out.println(minStack.minPeek()); // 1
    }

    private void testCase3() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        System.out.println(minStack.minPeek()); // 3
        minStack.push(3);
        System.out.println(minStack.minPeek()); // 3
        minStack.push(4);
        System.out.println(minStack.minPeek()); // 3
        minStack.pop(); // pops 4
        System.out.println(minStack.minPeek()); // 3
        minStack.pop(); // pops 3
        System.out.println(minStack.minPeek()); // 3
        minStack.pop(); // pops 3
        System.out.println(minStack.minPeek()); // BOOM
    }
}
