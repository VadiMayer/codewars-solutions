public class Ghost {
    private int randomNum = (int) (Math.random() * 4) + 1;
    private String color;

    public Ghost() {
        switch(randomNum) {
            case 1 -> color = "white";
            case 2 -> color = "yellow";
            case 3 -> color = "purple";
            case 4 -> color = "red";
        }
    }

    public String getColor() {
        return color;
    }
}
