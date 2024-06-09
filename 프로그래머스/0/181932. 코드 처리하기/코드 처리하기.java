class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        
        char[] arr = code.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {            
            if (mode == 0) {
                if (arr[i] != '1') {
                    ret += i % 2 == 0 ? arr[i] : "";
                } else {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (arr[i] != '1') {
                    ret += i % 2 == 1 ? arr[i] : "";
                } else {
                    mode = 0;
                }
            }
        }
        
        if (ret.isEmpty()) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}
