package array;

public class MinMergeToPalidrome {
    public static int nomerge(int arr[]){
        int start=0,end=arr.length-1;
        int num1=arr[0];
        int num2=arr[end];
        int count=0;

        while (start<end){
            if(num1==num2){
                start++;
                end--;
                num1=arr[start];
                num2=arr[end];
            }else if(num1<num2){
                start++;
                num1 +=arr[start];
                count++;
            }
            else{count++;
                end--;
                num2+=arr[end];
            }
            
        }
        return count;
    }

    public static void mergeOp(int[]arr){
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                ans++;
                if(arr[i]<arr[j]){
                    arr[i+1]+=arr[i];
                    i++;
                }else{
                    arr[j-1]+=arr[j];
                    j--;
                }
            }
        }
        System.out.println(ans);
        // return ans;

    }

    public static void main(String[] args) {
        int arr[]={11, 14, 15, 99};
        System.out.println(nomerge(arr));
        mergeOp(arr);
    }
    
}
