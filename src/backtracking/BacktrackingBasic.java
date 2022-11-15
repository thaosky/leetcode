package backtracking;

public class BacktrackingBasic {
    static String[] color = {"red", "green", "blue"};
    static int[] config = new int[color.length];

    /*
        Tùy thuộc bài toán, validValue có thể là {0, 1, 2 ,3} ...
        ở bài này chọn màu, chỉ có 2 lựa chọn là 0 - không chọn màu đó hoặc 1 - chọn
     */
    static int[] validValue = {0, 1};

    static void backtrack(int configIndex) {
        for (int i = 0; i < validValue.length; i++) {
            config[configIndex] = validValue[i];

            if (configIndex == color.length - 1) {
                process(config);
            } else {
                backtrack(configIndex + 1);
            }
        }
    }

    static void process(int[] config) {
        String newMixColor = "";
        for (int i = 0; i < config.length; i++) {
            if (config[i] == 1) {
                newMixColor = newMixColor + color[i] + " ";
            }
        }
        System.out.println(newMixColor);
    }

    public static void main(String[] args) {
        backtrack(0);
    }
}
