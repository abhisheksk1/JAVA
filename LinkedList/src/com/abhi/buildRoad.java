package com.abhi;
public class buildRoad {
    static int[] medal(int[] arr){
        int[] medals=new int[4];
        int maxMedals=0;
        int atLeastOneWinCount = 0;
        int noMedal=0;
        int medalsInThreeYears=0;
        for(int i=0;i<arr.length;i++){
            maxMedals+=arr[i];
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=1){
                atLeastOneWinCount+=1;
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]<1){
                noMedal+=1;
            }
        }
        for(int i=arr.length-1; i>=arr.length-3; i--){
            medalsInThreeYears+=arr[i];
        }

        medals[0]=maxMedals;
        medals[1]=atLeastOneWinCount;
        medals[2]=noMedal;
        medals[3]=medalsInThreeYears;
        return medals;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,0,0,0,1,1,1,3,6,2};
        int[] ans=medal(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
