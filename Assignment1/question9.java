package DSA_GATE.Assignment1;
public class question9 {
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void modifyMatrix(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        int[] row = new int[M];
        int[] col = new int[N];

        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
       
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (row[i]==1 || col[j]==1) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,0,0,1},
                {0,0,1,0},
                {0,0,0,0}
        };
        modifyMatrix(mat);
        printMatrix(mat);
    }
}
