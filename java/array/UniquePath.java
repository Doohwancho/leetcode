package juneChallenge;

public class UniquePath {
	
	//<����Ǯ��1>
	
	//dp
	
	//4x4�� ���ε�
	
	//�� ĭ�� �ּ� ��� �������� �� �� �ִ��� ���� ���� 2���� �迭�� ����
	
	//0 0 0 0
	//0 0 0 0
	//0 0 0 0
	//0 0 0 0
	
	//ù��°�� ���μ��δ� ������ �ص� �ѹ��� move�ιۿ� �� �� ������ 1�� ä��
	
	//1 1 1 1
	//1 0 0 0
	//1 0 0 0
	//1 0 0 0
	
	//���� �������� ��� ä��� �ε�..
	
	//������ ������ �غ��� �̷� ����� ����
	
    //1 1 1 1
    //1 2 3 4
    //1 3 6 10
    //1 4 10 20
	
	//�ڼ������� ����ĭ+��ĭ�� ���̶��� �� �� ����
	
	//�װ� dp[i][j] = dp[i-1][j] + dp[i][j-1];
	
	//�̷��� ����
	
	//Runtime: 0 ms
	//Memory Usage: 35.9 MB
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}