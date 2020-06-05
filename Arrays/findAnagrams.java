package Arrays;

class findAnagrams {
    public static void main(String[] args) {
        String arr = "DANGER";
        anagrams(arr);
    }

    static void anagrams(String arr) {
        String curr_str = "";
        int n = arr.length();
        int start;

        for (int k = 2; k <= n; k++) {
            for (start = 0; start < k; start++) {
                curr_str += arr.charAt(start);
            }
            System.out.print(curr_str + " ");
            for (start = k; start < n; start++) {
                char a = arr.charAt(start);
                String b = Character.toString(curr_str.charAt(0));
                curr_str += a;
                curr_str = curr_str.replace(b, ""); // strNew is 'bcdDCBA123'
                // curr_str += arr.charAt(start) - arr.charAt(start - k);
                System.out.print(curr_str + " ");
            }
            curr_str = "";
        }
    }
}