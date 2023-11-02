package Training;

public class Pattern {
    public static void printStarLine(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        printStarLine(n-1);
    }

    public static void printspaceLine(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("  ");
        printspaceLine(n-1);
    }

    public static void solidSquare(int row, int col) {
        if (row == 0) {
            return;
        }
        printStarLine(col);
        System.out.println();
        solidSquare(row-1, col);
    }
    public static void hollowSquare(int row, int col) {
        if (row == 0) {
            return;
        }
        hollowSquare(row-1, col);
        if (row == 1 || row == col) {
            printStarLine(col);
        } else {
            System.out.print("* ");
            printspaceLine(col-2);
            System.out.print("*");
        }
        System.out.println();
    }

    public static void rightTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        rightTriangle(row-1, col-1);
        printStarLine(col);
        System.out.println();
    }

    public static void rightTriangleMirror(int row, int col) {
        if (row == 0) {
            return;
        }
        rightTriangle(row-1, col-1);
        printspaceLine(col-row);
        printStarLine(col);
        System.out.println();
    }

    // public static void rightTriangleRev(int row, int col) {
    //     if (row == 0) {
    //         return;
    //     }
    //     printStarLine(col);
    //     System.out.println();
    //     rightTriangle(row-1, col-1);
    // }

    public static void main(String[] args) {
        // solidSquare(5, 5);
        // rightTriangle(5, 5);
        hollowSquare(5, 5);
        rightTriangleMirror(5, 5);
    }
}
