package prac1;

import java.util.Scanner;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}


public class prac1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Tv t;
        t = new Tv();
        int chn = 1;

        System.out.print("채널을 입력해주세요");
        t.channel = scn.nextInt();
        System.out.println("채널을 올리려면 1번을, 내리려면 2번을, 채널변경을 종료하려면 0번을 입력해 주세요.\n");

        while (chn != 0) {

            chn = scn.nextInt();

            if (chn == 1) {
                t.channelUp();
            } else if (chn == 2) {
                t.channelDown();
            } else if (chn == 0) break;

            System.out.println("현재 채널은" + t.channel + "입니다");
        }
    }
}
