public class Test6_13 {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        int startX = 0;
        int endX = m - 1;
        int startY = 0;
        int endY = n - 1;
        int index = 0;
        int[] res = new int[n * m];
        while(startX <= endX && startY <= endY){
            if(startX <= endX){
                for (int i = startX; i <= endX; i++) {
                    res[index++] = mat[startY][i];
                }
            }
            if(startY < endY){
                for (int i = startY + 1; i <= endY; i++) {
                    res[index++] = mat[i][endX];
                }
            }
            if(startX < endX && startY < endY){
                for (int i = endX - 1; i >= startX; i--) {
                    res[index++] = mat[endY][i];
                }
            }
            if(startX < endX && startY < endY){
                for (int i = endY - 1; i >= startY + 1; i--) {
                    res[index++] = mat[i][startX];
                }
            }
            startX++;
            endX--;
            startY++;
            endY--;
        }
        return res;
    }
}