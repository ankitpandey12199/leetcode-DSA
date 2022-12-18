class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer>list=new ArrayList<>();
        int left=0,right=matrix[0].length-1,up=0,down=matrix.length-1;
        int dir=0;
        while(left<=right && up<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[up][i]);
                }
                up++;
            }
            else if(dir==1)
            {
                for(int i=up;i<=down;i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3)
            {
              for(int i=down;i>=up;i--)
              {
                  list.add(matrix[i][left]);
              }
                left++;
            }
            dir++;
            dir%=4;
        }
          return list;
    }
  
}