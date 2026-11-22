class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(String item:operations){
            if(item.equals("+")){
                ans.add(ans.get(ans.size()-1) + ans.get(ans.size()-2));
            }
            else if(item.equals("D")){
                ans.add(ans.get(ans.size()-1)*2);
            }
            else if(item.equals("C")){
                ans.remove(ans.get(ans.size()-1));
            }
            else{
                ans.add(Integer.parseInt(item));
            }
        }
        int sum = 0;
        for(int val:ans){
            sum += val;
        }
        return sum;
    }
}