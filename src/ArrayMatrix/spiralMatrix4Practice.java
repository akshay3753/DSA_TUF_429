package ArrayMatrix;

public class spiralMatrix4Practice {
    public static int[][] spiralMatrix4(int m, int n, ListNode head){
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = -1;
            }
        }
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (head != null){
            for (int i = left; i <= right && head!= null; i++) {
                result[top][i] = head.val;
                head = head.next;
            }
            top++;

            for (int i = top; i <= bottom && head != null ; i++) {
                result[i][right] = head.val;
                head= head.next;
            }
            right--;

            for (int i = right; i >= left && head != null; i--) {
                result[bottom][i] = head.val;
                head= head.next;
            }
            bottom--;

            for (int i = bottom; i >= top && head != null ; i--) {
                result[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        // Write your solution here
        int m = 3;
        int n = 5;
        ListNode head = new ListNode(3);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);

        int[][] ans = spiralMatrix4(m, n, head);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

