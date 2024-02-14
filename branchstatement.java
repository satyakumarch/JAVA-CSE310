public class branchstatement {
    public static void main(String[] args) {
        String[] arr={"satya","shivam","sohan","radha","gupta"};
        //String searchname="satya";
        String searchname=Interger.parse(args[]);
        int j;
        boolean foundname=false;
        for(j=0;j<arr.length;j++){
            if(arr[j]==searchname){
                foundname=true;
                break;
            }
        }
        if(foundname){
            System.out.println("The name "+searchname+" is found at index "+j);
        }else{
            System.out.println(searchname);
        }
    }
}
