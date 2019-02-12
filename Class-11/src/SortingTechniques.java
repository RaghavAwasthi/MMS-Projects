public class SortingTechniques {


    public static void main(String ar[]) {

        int arr[] = {1, 5, 8, 9, 58, 59, 36, 58, 14, 25}; //Yaha par ye Dummy data hai
        bubble(arr);
        selection(arr);

    }

    public static void bubble(int st[]) {
        int size = st.length; // Size nikal li taki easy rahi yaha par iski value 10 hai
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (st[j - 1] <= st[j]) // j-1 lenge varna complex ho jayega
                {
                    int tmp = st[j];
                    st[j] = st[j - 1];
                    st[j - 1] = tmp;
                }

            }
        }
        
        
    }
 void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    public static void selection(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[index]) {
                    index = j;
                }
            }
            int smallerNumber = ar[index];
            ar[index] = ar[i];
            ar[i] = smallerNumber;
        }

        
    }

}

