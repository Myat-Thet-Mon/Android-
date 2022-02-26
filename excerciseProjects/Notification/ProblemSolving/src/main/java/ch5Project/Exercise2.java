package ch5Project;

class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public void setZero() {
        this.count = 0;
    }

    public int increment() {
        count++;
        return count;
    }

    public int decrement() {
        if (count > 0) {
            count--;
        }
        return count;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Counter obj = new Counter();
        obj.decrement();
        obj.decrement();
        obj.decrement();
        obj.increment();
        obj.increment();
        obj.setZero();
        obj.increment();
        obj.increment();
        obj.decrement();
        System.out.println(obj.getCount());
    }
}
