class Solution {
    public String[] shortestSubstrings(String[] arr) {
        int len = arr.length;
        String res[] = new String[len];
        for (int i = 0; i < len; i++) {
            ArrayList<String> substrings = new ArrayList<>();
            for (int j = 0; j < arr[i].length(); j++) {
                for (int k = j ; k <= arr[i].length(); k++) {
                    String subString = arr[i].substring(j, k);
                    int fl = 0;
                    for (int m = 0; m < len; m++) {
                        if (m != i && arr[m].contains(subString)) {
                            fl = 1;
                            break;
                        }
                    }
                    if (fl == 0) {
                        substrings.add(subString);
                    }
                }
            }
             Collections.sort(substrings, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    if (a.length() != b.length()) {
                        return a.length() - b.length();
                    } else {
                        return a.compareTo(b);
                    }
                }
            });
            if (!substrings.isEmpty())
                res[i] = substrings.get(0);
            else
                res[i] = "";
        }
        return res;
    }
}

/*
    Time Complexity: O(n^3) where n is the length of the input array arr
    Space Complexity: O(n) where n is the length of the input array arr
*/