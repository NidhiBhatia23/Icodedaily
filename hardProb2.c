// To compile : gcc -o hardProb2.x hardProb2.c -std=c99
// To run     : ./hardProb2.x
// Time complexity : O(n)
// Space complexity : O(n)
// Auxiliary space complexity : O(1)
// Output : 120 60 40 30 24 

#include <stdio.h>
#include <stdlib.h>

void main() {
    
    int arr[] = {1, 2, 3, 4, 5}; 
    int n = sizeof(arr)/sizeof(int);

    int temp = 1;
    int *out = (int*)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++) {
        out[i] = temp;
        temp = temp * arr[i]; 
    }   

    temp = 1;
    for (int i = (n-1); i > -1; i--) {
        out[i] = out[i] * temp;
        temp = temp * arr[i];
    }   

    for (int i = 0; i < n; i++) {
        printf("%d ", out[i]);
    }   
    printf("\n");

    free(out);
}
