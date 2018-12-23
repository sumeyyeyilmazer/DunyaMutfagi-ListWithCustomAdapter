package e.smyye.dunyamutfagi;

import java.io.Serializable;

public class Food implements Serializable {

    private String contryName;
    private String foodName;
    private int background;

    public Food() {
    }

    public Food(String contryName, String foodName, int background) {
        this.contryName = contryName;
        this.foodName = foodName;
        this.background = background;
    }

    public String getContryName() {
        return contryName;
    }

    public void setContryName(String contryName) {
        this.contryName = contryName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
