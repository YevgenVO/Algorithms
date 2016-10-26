package gmail.yevgenij.v.o.containerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int var;
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        for(;j > i;) {
            if(height[i] > height[j]) {
                var = height [j];
                if(area < var * (j - i)){
                    area = var * (j - i);
                }
                j--;
            }else{
                var = height [i];
                if(area < var * (j - i)){
                    area = var * (j - i);
                }
                i++;
            }
        }
        return area;
    }
}