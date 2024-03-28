class singleinheritance3 {
    int id;
    float javamark;
    float cmarks;
    float cppmark;

    void setMarks(int id, float javamark, float cmarks, float cppmark) {
        this.id = id;
        this.javamark = javamark;
        this.cmarks = cmarks;
        this.cppmark = cppmark;
    }

    void displayMark() {
        System.out.println("Id: " + id);
        System.out.println("javaMark: " + javamark);
        System.out.println("Cmarks: " + cmarks);
        System.out.println("Cppmark: " + cppmark);
    }
}

class Result extends singleinheritance3 {
    float total;
    float avg;

    void compute() {
        total = javamark + cmarks + cppmark;
        avg = total / 3;
    }

    void showResult() {
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

class singleinheritanceDemo {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        float javamark = Float.parseFloat(args[1]);
        float cmarks = Float.parseFloat(args[2]);
        float cppmark = Float.parseFloat(args[3]);
        Result obj = new Result();
        obj.setMarks(id, javamark, cmarks, cppmark);
        obj.displayMark();
        obj.compute();
        obj.showResult();
    }
}
