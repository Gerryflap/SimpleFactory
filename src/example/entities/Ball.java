package example.entities;

public class Ball extends Entity {
    private float vx;
    private float vy;

    public Ball(float x, float y, float vx, float vy) {
        super(x, y);
        this.vx = vx;
        this.vy = vy;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }
}
