public class ArrayRotation {

    static int DISPLACEMENT=1;
    static int[] array_Definition={1,2,3,4,5,6,7,8,9,10,11};
    static int arraySize=array_Definition.length;

    public static void main(String[] args){
           /*for(int index=0;index<DISPLACEMENT;index++){
               ShiftLeftByOne();
           }*/
        jugglingAlgorithm();
    }


    static void jugglingAlgorithm(){
        int gcd=findGCD(arraySize,DISPLACEMENT);
        System.out.println(gcd);
        for(int index=0;index<gcd;index++){
            int temp=0,j=0,k=0;
            temp=array_Definition[index];
            j=index;
            while (k<DISPLACEMENT){
                array_Definition[j]=array_Definition[j+DISPLACEMENT];
                j=j+DISPLACEMENT;
                k++;
            }
            array_Definition[j]=temp;
        }
        printArray();
    }

    static int findGCD(int a,int b){
        if(b==0){
            return a;
        }else{
            return findGCD(b,a%b);
        }
    }

    static void ShiftLeftByOne(){
        int temp=array_Definition[0];
        for(int index=0;index<arraySize-1;index++){
            array_Definition[index]=array_Definition[index+1];
        }
        array_Definition[arraySize-1]=temp;
    }


    static void printArray(){
        for(int index=0;index<arraySize;index++){
            System.out.println(array_Definition[index]);
        }
    }
}
