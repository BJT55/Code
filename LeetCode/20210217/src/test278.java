public class test278 {
}

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
// 若直接用循环去遍历，则会出现超时情况
// 使用二分查找
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}*/
