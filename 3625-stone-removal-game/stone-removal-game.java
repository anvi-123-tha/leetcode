class Solution {
public boolean canAliceWin(int n) {
    int alistone=10;
    boolean alice=true;
    while(n>=alistone){
        n=n-alistone;
        alistone--;
        alice=!alice;
    }
    return !alice;
}  
}