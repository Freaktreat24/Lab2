class ObjectCounter {
    static int count = 0;

    ObjectCounter() {
        count++;
    }

    static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ObjectCounter o1 = new ObjectCounter();
        ObjectCounter o2 = new ObjectCounter();
        ObjectCounter o3 = new ObjectCounter();

        System.out.println("Number of objects = " + ObjectCounter.getCount());
    }
}

