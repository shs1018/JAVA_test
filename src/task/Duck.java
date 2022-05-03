package task;


import java.util.Random;

public class Duck {
    Random random = new Random();
    private Integer x;
    private Integer y;
    private String status;

    public Duck() {
        x = 0;
        y = 0;
        status = "ground";
    }

    public Integer getX() {
        x = random.nextInt(16);
        return x;
    } //getter

    public void setX() {
        if (x < 0) {
            this.x = 0;
        } else {
            this.x = x;
        } //좌표는 0 미만이 없으므로 0 미만의 값이 들어올 경우 값을 가장 작은 0으로 초기화 함.
    }//setter

    public Integer getY() {
        y = random.nextInt(6);
        return y;
    }

    public void setY() {
        if (y < 0) {
            this.y = 0;
        } else {
            this.y = y;
        }
    }
    //필드 값에 부적절한 값, 즉, 음수가 들어가면 안되는데 음수와 같은 오류를 일으킬 수 있는 값이 들어가는 경우 등을 막기 위하여 설정.

    public String getStatus() {
        if (y == 0 || y == 5) {
            if (x < 5 || x > 10) {
                status = "ground";
            } else {
                status = "water";
            }
        } else if (y == 1 || y == 4) {
            if (x < 4 || x > 11) {
                status = "ground";
            } else {
                status = "water";
            }
        } else if (y == 2 || y == 3) {
            if (x < 3 || x > 12) {
                status = "ground";
            } else {
                status = "water";
            }
        }
        return status;
    }

    public void setStatus(String status) {
    }
}

//water 또는 ground의 값을 갖는다....갖는데....

