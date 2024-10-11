/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArray) {
        int peak = peakIndex(mountainArray);
        int index = binarySearch(mountainArray, target,0,peak);
        if(index != -1){
            return index;
        }
        return binarySearch(mountainArray,target,peak+1,mountainArray.length()-1);
    }
    private int peakIndex(MountainArray mountainArray){
        int start = 0;
        int end = mountainArray.length()-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mountainArray.get(mid)>mountainArray.get(mid+1)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    private int binarySearch(MountainArray mountainArray, int target, int start,int end){
        boolean isAscending = mountainArray.get(start) < mountainArray.get(end);
        while(start <= end){
            int mid = start + (end - start)/2;
            int midElement = mountainArray.get(mid);
            if(target == midElement){
                return mid;
            }
            if(isAscending){
                if(target > midElement){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target > midElement){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            
        }
        return -1;
    }
}
