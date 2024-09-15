package Arrays;


public class Testing {
    public static float getShortPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 's') {
                y--;
            } else if (dir == 'n') {
                y++;
            } else if (dir == 'w') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return x2 + y2;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortPath(path));
    }
    }

