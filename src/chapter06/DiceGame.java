package chapter06;

public class DiceGame {
    public static void main(String[] args) {
        int count = 0;
        int dice1 = 0, dice2 = 0, dice3 = 0;

        while(true) {
            count++;

            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
            dice3 = (int)(Math.random() * 6) + 1;

            if((dice1 == dice2) && (dice2 == dice3))
                break;
        }
        System.out.printf("3개의 주사위는 모두 숫자 %d입니다.\n", dice1);
        System.out.printf("3개의 주사위의 같은 숫자가 될 때까지 %d번 던졌습니다.", count);
    }
}
