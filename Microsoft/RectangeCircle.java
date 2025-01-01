class Solution {
    public boolean checkOverlap(int r, int cx, int cy, int x1, int y1, int x2, int y2) {
        int cx1 = Math.max(x1, Math.min(cx, x2));
        int cy1 = Math.max(y1, Math.min(cy, y2));
        int dx = cx - cx1, dy = cy - cy1;
        return dx * dx + dy * dy <= r * r;
    }
}
