//To change the original array and get the repeating 0's:

class Solution {
    public void duplicateZeros(int[] arr) {
        //what is the stopping condition for the array in which values are being inputted currently?
        int arr2[]=new int[arr.length*2];
        //considering the length of the arrray will not be more than twice than what the original array already is;
        
        int i=0;
        int j=0;
        
        for(i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr2[j]=0;
                j++;
                arr2[j]=0;
                j++;
            }
            else{
                arr2[j]=arr[i];
                j++;
            }
        }
        //Not worked as original array was to be returned;
        //end of loop;
        // int[] arr3= Arrays.copyOfRange(arr2, 0, arr.length);
        // return arr3;
        
        // for(int k=0;k<arr2.length;k++){
        //     System.out.print(arr2[k]);
        // }
        
        
        // Cannot get this range to be assigned to the new array as it only returns
        // and array as a whole cannot be assigned values like this;
        //they are copy by refernce so each object has to be assigned a value separately;
        // arr=Arrays.copyOfRange(arr2, 0, arr.length);
        
        for(int k=0;k<arr.length;k++){
            arr[k]=arr2[k];
        }
    }
}
