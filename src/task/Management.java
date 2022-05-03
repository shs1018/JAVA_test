package task;

public class Management {

    private Duck duck1;
    private Duck duck2;
    private Duck duck3;

    public Management() {
        duck1 = new Duck();
        duck2 = new Duck();
        duck3 = new Duck();
    }

    public void printLake() {
        int[][] lake = {
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}
        };
        //오리 좌표 찍기
        lake[duck1.getY()][duck1.getX()] = 2;
        lake[duck2.getY()][duck2.getX()] = 2;
        lake[duck3.getY()][duck3.getX()] = 2;

        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                System.out.print(lake[i][j]); // 출력 프로세스
            }
            System.out.println(); //물은 1, 땅은 0, 오리는 2로 표현 (일단)
        }
    }


    public void showAllDuckInfo() {
        System.out.printf("Duck no.1 :(%d, %d) / %s\n", duck1.getX(), duck1.getY(), duck1.getStatus());
        System.out.printf("Duck no.2 :(%d, %d) / %s\n", duck2.getX(), duck2.getY(), duck2.getStatus());
        System.out.printf("Duck no.3 :(%d, %d) / %s\n", duck3.getX(), duck3.getY(), duck3.getStatus());
        System.out.println();
    }

    public void randomPositionGenerator() {
        int Duck1X = duck1.getX();
        int Duck1Y = duck1.getY();
        int Duck2X = duck2.getX();
        int Duck2Y = duck2.getY();
        int Duck3X = duck3.getX();
        int Duck3Y = duck3.getY();
    } //랜덤 값을 받아와서 저장
}//UTF-8인코딩이 안되어 한글이나 영어가 안뜨는데, 구글링해서 나온 방법을 다 써봐도 되지를 않습니다...(설정 가서 바꾸기,사용자 지정 VM옵션 추가등)
