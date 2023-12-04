package org.example;

public class MyWrapper<T> {

    private T value;
    private Summary summary = new Summary();

    public T getValue() {
        ++summary.getCount;
        return value;
    }

    public void setValue(T value) {
        ++summary.changeCount;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyWrapper{" +
                "value=" + value +
                ", summary=" + summary +
                '}';
    }

    private static class Summary {
        private int getCount;
        private int changeCount;

        @Override
        public String toString() {
            return "Summary{" +
                    "getCount=" + getCount +
                    ", changeCount=" + changeCount +
                    '}';
        }
    }
}
