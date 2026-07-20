import java.util.*;

class subarraydivisionbyk {

    static long subarraysDivByK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        long count = 0;

        for (int num : arr) {
            prefix += num;
            int rem = prefix % k;

            if (rem < 0)
                rem += k;
               count += map.getOrDefault(rem, 0);
                 map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        int k = Integer.parseInt(sc.nextLine().trim());
            System.out.println(subarraysDivByK(arr, k));
    }
}