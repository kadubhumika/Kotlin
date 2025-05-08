//program to check palidrome using recurrsion
#include<stdio.h>
#include<string.h>
bool checkPalidrome(char str[], int start , int end){
if(start>=end){
return true;
}
if(str[start]!=str[end]){
return false;
}



return checkPalidrome(str,start+1,end-1);
}
int main(){
int n;
n=strlen(str);
char str[100];
fgets(str, sizeof(str), stdin);

str[strcspn(str, "\n")] = '\0';


if(checkPalidrome(str,0,n)){
printf("Yest ! it is palidrome");
}
else{
printf("NO ! it is not palidrome");
}

return 0;
}