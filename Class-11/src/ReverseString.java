public class ReverseString {


        public static void main(String[] args) {
            String str = "Anything can be there";
            String reversed = reverse(str);
            System.out.println("The reversed string is: " + reversed);
        }

        public static String reverse(String str)
        {
            if (str.isEmpty())
                return str;
            //Calling Function Recursively
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

