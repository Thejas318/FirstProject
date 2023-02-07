package Practice.January2023.Java8Enhancements.Jan6th;

import java.util.List;

public class Dishes {

    private String dishname;
    private int calories;
    private List<String> ingredients;
    private Dishtype dishtype;


    public Dishes(String dishname, int calories, List<String> ingredients, Dishtype dishtype) {
        this.dishname = dishname;
        this.calories = calories;
        this.ingredients = ingredients;
        this.dishtype = dishtype;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Dishtype getDishtype() {
        return dishtype;
    }

    public void setDishtype(Dishtype dishtype) {
        this.dishtype = dishtype;
    }


    @Override
    public String toString() {
        return "Dishes{" +
                "dishname='" + dishname + '\'' +
                ", calories=" + calories +
                ", ingredients=" + ingredients +
                ", dishtype=" + dishtype +
                '}';
    }
}
