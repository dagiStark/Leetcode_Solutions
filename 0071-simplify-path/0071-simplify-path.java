class Solution {
    public String simplifyPath(String path) {
        String[] newPath = path.split("/");
        Stack<String> ans = new Stack<>();
        String n = "";
        for(String i : newPath){
            if(i.equals("..") && !ans.isEmpty()) ans.pop();
            else if(i.equals("..") && ans.isEmpty());
            else if(i.equals(".") ||  i.equals("")) ;
            else ans.push("/" + i);
        }
        if(ans.isEmpty()) ans.push("/");
        for(String i : ans){
            n += i;
        }
        return n;
    }
}