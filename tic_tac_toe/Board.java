public class Board {

    private int n;
    private Integer[][] cells;

    public Board() {
        super();
    }

    public Board(int n) {
        this.n = n;
        this.cells = new Integer[n][n];
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public Integer getState(int x, int y) {
        return this.cells[x][y];
    }

    public void setState(int x, int y, Integer state) {
        this.cells[x][y] = state;
    }

    public boolean isWinning(int x, int y) {
        Integer s = this.cells[x][y];

        if (s == null) {
            return false;
        }

        boolean isWinning = true;

        for (int i = 0; i < n; i++) {
            if (this.cells[i][y] != s) {
                isWinning = false;
                break;
            }
        }

        if (isWinning) {
            return true;
        }

        isWinning = true;
        for (int j = 0; j < n; j++) {
            if (this.cells[x][j] != s) {
                isWinning = false;
                break;
            }
        }
 
        if (isWinning) {
            return true;
        }

        if (x == y) {// diagonal line
            isWinning = true;
            for (int i = 0; i < n; i++) {
                if (this.cells[i][i] != s) {
                    isWinning = false;
                    break;
                }
            }

            if (isWinning) {
                return true;
            }
        }

        if (x == n-1 - y) {// reverse diagonal line
            isWinning = true;
            for (int i = 0; i < n; i++) {
                if (this.cells[i][n-1-i] != s) {
                    isWinning = false;
                    break;
                }
            }

            if (isWinning) {
                return true;
            }
        }

        return false;
    }
}