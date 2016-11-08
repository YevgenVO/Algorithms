package gmail.yevgenij.v.o.containerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int tempHeight;
        int i = 0;
        int j = height.length - 1;
        int conteinerArea = 0;
        while (j > i) {
            if(height[i] > height[j]) {
                tempHeight = height [j];
                if(conteinerArea < tempHeight * (j - i)){
                    conteinerArea = tempHeight * (j - i);
                }
                j--;
            }else{
                tempHeight = height [i];
                if(conteinerArea < tempHeight * (j - i)){
                    conteinerArea = tempHeight * (j - i);
                }
                i++;
            }
        }
        return conteinerArea;
    }
}