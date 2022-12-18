class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int [n][n];
        int left=0,right=matrix[0].length-1,up=0,down=matrix.length-1;
        int dir=0;
        int count=1;
        while(left<=right && up<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    matrix[up][i]=count;
                    count++;
                }
                up++;
            }
            else if(dir==1)
            {
                for(int i=up;i<=down;i++)
                {
                    matrix[i][right]=count;
                    count++;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                  matrix[down][i]=count;
                    count++;
                }
                down--;
            }
            else if(dir==3)
            {
              for(int i=down;i>=up;i--)
              {
                  matrix[i][left]=count;
                  count++;
              }
                left++;
            }
            dir++;
            dir%=4;
        }
        return matrix;
    }
}