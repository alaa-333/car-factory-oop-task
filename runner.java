import java.util.HashSet;
import java.util.Set;

public class runner {

//    public static boolean adjacentSum(int[] arr , int target)
//    {
//        for (int i = 0; i< arr.length ; i++)
//        {
//            int sum = 0;
//            for (int j =i ; j <arr.length;j++)
//            {
//               sum+=arr[j];
//               if (sum == target)
//                    return  true;
//               if (sum > target)
//                    break;
//
//            }
//        }
//        return false;
//    }

    public static void mostFreq(int [] arr)
    {
        int oldCount = 0;
        int realNum = 0;
        int newcount =0;
        for (int i=0 ; i<arr.length ; i++)
        {
             oldCount = newcount;
             newcount = 0;

            for (int j=i+1 ; j <arr.length ; j++)
            {
                if (arr[i] == arr[j])
                    newcount++;
            }
            if (newcount > oldCount)
                realNum = arr[i];
        }
        System.out.println(realNum);
    }


    public static void main(String[] args) {

        int[] arr = {1,5,1,2,5,1};
        mostFreq(arr);


//        Car car = new Car("toyota","2019",20);
//        car.start();
//        car.acclerate();
//        car.acclerate();
//        car.breakSpeed();
//        car.breakSpeed();
//        car.breakSpeed();
//        car.breakSpeed();


    }
}
