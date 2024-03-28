

class addition3 {
    int add(int a, int b) {
        return a + b;
    }

    float add(int a, float b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(float a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        if (args.length < 6) {
            System.out.println("Insufficient arguments provided.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        float c = Float.parseFloat(args[2]);
        float d = Float.parseFloat(args[3]);
        double e = Double.parseDouble(args[4]);
        double f = Double.parseDouble(args[5]);
        addition3 obj = new addition3();

        System.out.println(obj.add(a, b));
        System.out.println(obj.add(a, c));
        System.out.println(obj.add(c, d));
        System.out.println(obj.add(c, e, f));
    }
}
