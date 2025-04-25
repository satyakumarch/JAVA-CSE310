class Lovely extends Exception{
    public Lovely (String str){
        super(str);
    }
}
class Test{
    public static void main(String[] args){
        Test obj=new Test();
        try{
            obj.display();

        }catch(Exception e){
            System.out.println(e);
        }


    }
   // System.out.println("hello c");
}
