package BasicCode;

public class SmallestElementOfArray {
public static void main(String[] args) {
    int num [] = {1,2,3,5,64,3};
    int min = num[0];

    for (int i = 1; i < num.length; i++) {
        if(num[i] < min){
            min = num[i];

        }

    }
    System.out.println(" Smallest Element of Array "+ min);
    
}

}
