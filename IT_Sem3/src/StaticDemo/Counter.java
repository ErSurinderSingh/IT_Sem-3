package StaticDemo;

class Counter {
//will get memory each time when the instance is created

    static int count = 0;

    Counter() {
        //incrementing value of count	
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        System.out.println(count);
        //Creating objects		
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
