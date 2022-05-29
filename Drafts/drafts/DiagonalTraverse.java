package drafts;

public class DiagonalTraverse {
    /*j=0;k=0;j down; k up
0:0 --> j=-1;k=1;j up 0 k down 1
0:1 --> j=1;k=0;
1:0 --> j=2;k=0;
2:0 -->
1:1
0:2
1:2
2:1
2:2

[1,2]
[3,4]
[5,6]
[7,8]
0:0
0:1
1:0
2:0
1:1
2:1
3:0
3:1*/
    public int[] findDiagonalOrder(int[][] mat) {
        int x = mat[0].length;
        int y = mat[0].length;
        int[] newMatrix = new int[x * y];
        boolean incrementJ = false;
        boolean incrementK = true;
        for(int i = 0, j = 0, k = 0; i < newMatrix.length; i++) {
            newMatrix[i] = mat[j][k];
            j = incrementJ ? j + 1 : j - 1;
            k = incrementK ? k + 1 : k - 1;
            if(j < 0) {
                incrementJ = true;
                j++;
            } else if(j > x) {
                incrementJ = false;
                j--;
            }

            if(k < 0) {
                incrementK = false;
                k++;
            } else if(k > y) {
                incrementK = true;
                k--;
            }
        }
        return newMatrix;
    }
}
